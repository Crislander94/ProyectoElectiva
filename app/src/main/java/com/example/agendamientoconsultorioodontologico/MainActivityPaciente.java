package com.example.agendamientoconsultorioodontologico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivityPaciente extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_paciente);
    }
    public void GoCreateCit(View view){
        Intent i = new Intent(this, CreateCitPaciente.class);
        startActivity(i);
    }
    public void GoListCitas(View view){
        Intent i = new Intent(this, ListCitasPaciente.class);
        startActivity(i);
    }public void GoLogin(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

}