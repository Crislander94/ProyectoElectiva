package com.example.agendamientoconsultorioodontologico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton rdpciente, rddoctor;
    EditText TXT_USR, TXT_PASS;
    Button BTN_ING;
    Button BTN_NuevoRegistro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TXT_USR =findViewById(R.id.editTextTextPersonName);
        TXT_PASS =findViewById(R.id.editTextTextPassword);
        rdpciente =  findViewById(R.id.rdpaciente);
        rddoctor =   findViewById(R.id.rddoctor);
        BTN_NuevoRegistro = findViewById(R.id.btn_registrar);
        BTN_ING = findViewById(R.id.btn_aceptar);
        BTN_ING.setOnClickListener(v -> {
            String V_USR = TXT_USR.getText().toString();
            String V_PASS = TXT_PASS.getText().toString();

            if (V_USR.equals("paciente") && V_PASS.equals("123456") && rdpciente.isChecked()){
                Toast.makeText(getApplicationContext(),"Datos correcto",Toast.LENGTH_SHORT).show();
                Intent i2 = new Intent(this, MainActivityPaciente.class);
                startActivity(i2);
                return;
            }else if(V_USR.equals("doctor") && V_PASS.equals("123456") && rddoctor.isChecked()){
//                Toast.makeText(getApplicationContext(),"Datos Correctos",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(this, MainActivity2_Doctor.class);
                startActivity(i);
                return;
            }else{
                Toast.makeText(getApplicationContext(),"Datos erroneos",Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void GoRegistrarUsuario(View view){
        Intent i = new Intent(this, registrarUsuario.class);
        startActivity(i);
    }

}