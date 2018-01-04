package com.example.ibai.afari;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Ibai on 14/12/2017.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME="register.db";
    public static final String TABLE_NAME="register";
    public static final String  COL_1="ID";
    public static final String  COL_2="FirstName";
    public static final String  COL_3="LastName";
    public static final String  COL_4="Username";
    public static final String  COL_5="Password";
    public static final String  COL_6="Email";
    public static final String  COL_7="Phone";

    public DatabaseHelper(Context context){
    super(context,DATABASE_NAME,null,1);
    }

    public void onCreate(SQLiteDatabase db){
        db.execSQL("CREATE TABLE" +TABLE_NAME+ "(ID INTEGER PRIMARY KEY AUTO INCREMENT, FirstName TEXT, LastName TEXT, Username TEXT,Password TEXT, Email TEXT, Phone TEXT)");
    }
    public void onUpgrade(SQLiteDatabase db, int oldversion, int newversion){
        db.execSQL("DROP TABLE IF EXISTS"+TABLE_NAME); //Drop older table if exists
        onCreate(db);
    }
}
