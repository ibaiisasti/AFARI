package com.example.ibai.afari;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class pagina_principal extends AppCompatActivity {

    private DrawerLayout dl;
    private ActionBarDrawerToggle abdt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_principal);

        dl = (DrawerLayout) findViewById(R.id.dl);
        abdt = new ActionBarDrawerToggle(this, dl, R.string.Open, R.string.Close);
        abdt.setDrawerIndicatorEnabled(true);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        dl.addDrawerListener(abdt);
        abdt.syncState();
        NavigationView new_view = (NavigationView)findViewById(R.id.nav_view);

        new_view.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();

                if (id == R.id.menus)
                {
                    Toast.makeText(pagina_principal.this, "Menu", Toast.LENGTH_LONG).show();
                }
                if (id == R.id.reservas)
                {
                    Toast.makeText(pagina_principal.this, "Reservas", Toast.LENGTH_LONG).show();
                }
                if (id == R.id.mesas)
                {
                    Toast.makeText(pagina_principal.this, "Mis Mesas", Toast.LENGTH_LONG).show();
                }
                if (id == R.id.cuentas)
                {
                    Toast.makeText(pagina_principal.this, "Cuentas", Toast.LENGTH_LONG).show();
                }
                if (id == R.id.ajustes)
                {
                    Toast.makeText(pagina_principal.this, "Ajustes", Toast.LENGTH_LONG).show();
                }
                if (id == R.id.Editar)
                {
                    Toast.makeText(pagina_principal.this, "Editar perfil", Toast.LENGTH_LONG).show();
                }

                return true;
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item) || super.onOptionsItemSelected(item);
    }
}

