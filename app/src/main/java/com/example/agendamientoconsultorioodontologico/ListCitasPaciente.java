package com.example.agendamientoconsultorioodontologico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ListCitasPaciente extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_citas_paciente);
    }

    public void GoMainActivityMainPaciente(View view){
        Intent i = new Intent(this, MainActivityPaciente.class);
        startActivity(i);
    }
    public void GoDetalleLista(View view){
        Intent i = new Intent(this, DetalleCitasPaciente.class);
        startActivity(i);
    }
}