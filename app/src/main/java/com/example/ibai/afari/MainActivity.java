package com.example.ibai.afari;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    SQLiteOpenHelper openHelper;
    SQLiteDatabase db;
    Button _boton_reg;
    EditText _txt_Fname, _txt_Lname, _txt_username, _txt_psswrd, _txt_email, _txt_phone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        openHelper = new DatabaseHelper(this);
        _boton_reg = (Button) findViewById(R.id.boton_reg);
        _txt_Fname = (EditText) findViewById(R.id.txt_Fname);
        _txt_Lname = (EditText) findViewById(R.id.txt_Lname);
        _txt_username = (EditText) findViewById(R.id.txt_username);
        _txt_psswrd = (EditText) findViewById(R.id.txt_psswrd);
        _txt_email = (EditText) findViewById(R.id.txt_email);
        _txt_phone = (EditText) findViewById(R.id.txt_phone);

        _boton_reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                db=openHelper.getWritableDatabase();
                String fname = _txt_Fname.getText().toString();
                String lname = _txt_Lname.getText().toString();
                String username = _txt_username.getText().toString();
                String psswrd = _txt_psswrd.getText().toString();
                String email = _txt_email.getText().toString();
                String phone = _txt_phone.getText().toString();

                insertdata(fname, lname, username, psswrd, email, phone);
                Toast.makeText(getApplicationContext(), "register succesfully", Toast.LENGTH_LONG).show();

            }
        });
    }

    public void insertdata (String fname, String lname, String username, String psswrd, String email, String phone) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(DatabaseHelper.COL_2, fname);
        contentValues.put(DatabaseHelper.COL_3, lname);
        contentValues.put(DatabaseHelper.COL_4, username);
        contentValues.put(DatabaseHelper.COL_5, psswrd);
        contentValues.put(DatabaseHelper.COL_6, email);
        contentValues.put(DatabaseHelper.COL_7, phone);
        long id = db.insert(DatabaseHelper.TABLE_NAME,null, contentValues);
    }
}
