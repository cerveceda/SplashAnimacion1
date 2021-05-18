package com.example.splashanimacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void login(View view) {
        Intent intent = new Intent(Login.this, Splash.class);
        startActivity(intent);
    }

    public void crearCuenta(View view) {
        Intent intent2 = new Intent(Login.this, CrearCuenta.class);
        startActivity(intent2);
    }
}