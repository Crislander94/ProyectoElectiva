package com.example.agendamientoconsultorioodontologico;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
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

            String usu=new String("paciente");
            String pass = new String("123456");
            String usu1 = new String("doctor");
            String pass2 = new String("123456");

            String res = new String();

            if (usu.equals(V_USR) && pass.equals(V_PASS) && rdpciente.isChecked()){
                AlertDialog.Builder alerta =new AlertDialog.Builder(MainActivity.this);
                alerta.setMessage("¿DESEA MANTENER LA SESIÓN ACTIVA?").setCancelable(false)
                        .setPositiveButton("Si", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                guardarPreferencias();

                                String respu = new String();
                                Toast.makeText(MainActivity.this,"Datos correcto",Toast.LENGTH_SHORT).show();
                                respu="Datos correctos";

                                Intent i2 = new Intent(MainActivity.this, MainActivityPaciente.class);
                                i2.putExtra("usu",TXT_USR.getText().toString());
                                startActivity(i2);

                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();

                                String respu = new String();
                                Toast.makeText(MainActivity.this,"Datos Correctos", Toast.LENGTH_SHORT).show();
                                respu="Datos Correctos";

                                Intent i2 = new Intent(MainActivity.this, MainActivityPaciente.class);
                                i2.putExtra("usu",TXT_USR.getText().toString());
                                startActivity(i2);
                            }
                        });
                AlertDialog alertPref = alerta.create();
                alertPref.setTitle("Mantener Sesion");
                alertPref.show();

            } if(usu1.equals(V_USR) && pass2.equals(V_PASS) && rddoctor.isChecked()){

                AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity.this);
                alerta.setMessage("¿Desea mantener la sesión activa?").setCancelable(false)
                        .setPositiveButton("Si", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                guardarPreferencias();
                                String resp = new String();
                                Toast.makeText(MainActivity.this, "Datos Correctos", Toast.LENGTH_SHORT).show();
                                resp="Datos Correctos";

                                Intent i = new Intent( MainActivity.this, MainActivity2_Doctor.class);
                                i.putExtra("usuario",TXT_USR.getText().toString());
                                startActivity(i);
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                                String resp = new String();
                                Toast.makeText(MainActivity.this, "Datos Correctos", Toast.LENGTH_SHORT).show();
                                resp="Datos Correctos";

                                Intent i = new Intent(MainActivity.this,MainActivity2_Doctor.class);
                                i.putExtra("usuario",TXT_USR.getText().toString());
                                startActivity(i);
                            }
                        });
                AlertDialog alertPref = alerta.create();
                alertPref.setTitle("Mantener Sesion");
                alertPref.show();
//                Toast.makeText(getApplicationContext(),"Datos Correctos",Toast.LENGTH_SHORT).show();

            }else{
                Toast.makeText(getApplicationContext(),"Datos erroneos",Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void guardarPreferencias(){
        SharedPreferences preferencias = getSharedPreferences("credenciales", Context.MODE_PRIVATE);
        String usuario_pref = TXT_USR.getText().toString();
        String password_pref =TXT_PASS.getText().toString();

        SharedPreferences.Editor editor=preferencias.edit();
        editor.putString("user", usuario_pref);
        editor.putString("pass", password_pref);

        editor.commit();
    }

    public void GoRegistrarUsuario(View view){
        Intent i = new Intent(this, registrarUsuario.class);
        startActivity(i);
    }

}