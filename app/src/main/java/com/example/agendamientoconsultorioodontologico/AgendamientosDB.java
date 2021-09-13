package com.example.agendamientoconsultorioodontologico;

public class AgendamientosDB {



    interface ColumnasPaciente{
        String ID = "id";
        String NOMBRES = "nombres";
        String PASSWORD = "password";
        String CORREO = "correo";
        String TELEFONO = "telefono";
        String CEDULA = "cedula";
    }
    interface ColumnasCita{
        String ID = "cod_cita";
        String DOCTOR = "cod_doctor";
        String PACIENTE = "cod_paciente";
        String SERVICIO  = "servicio";
        String FECHAAGENDA = "fecha_agendamiento";
        String FECHAEXP = "fecha_expiracion";
        String SINTOMAS = "sintomas";
    }



}
