package com.example.agendamientoconsultorioodontologico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class registrarUsuario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_usuario);
    }

    public void GoMainActivityPaciente(View view){
        Intent i = new Intent(this, MainActivityPaciente.class);
        startActivity(i);
    }
    public void GoLogin(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}