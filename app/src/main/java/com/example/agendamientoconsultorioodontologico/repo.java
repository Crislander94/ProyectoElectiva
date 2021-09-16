package com.example.agendamientoconsultorioodontologico;

public class repo {
    public static final String U_USUARIO =  "usuario";
    public static final String T_REGISTRO = "Registro";
    public static final String C_CONTRASEÑA= "contraseña";
    public static final String T_TELEFONO= "telefono";
    public static final String F_FECHA= "fecha";
    public static final String CD_CIUDAD= "ciudad";
    public static final String S_SEXO= "sexo";
    public static final String CE_CEDULA= "ID";
    public static final String CREAR_TABLA_REGISTRO = "CREATE TABLE "+T_REGISTRO+"( "+C_CONTRASEÑA+" TEXT, "+CE_CEDULA+" TEXT, "+U_USUARIO+" TEXT, "
            +""+T_TELEFONO+" TEXT, "+F_FECHA+" INT, "+CD_CIUDAD+" TEXT, "+S_SEXO+" TEXT, "+C_CONTRASEÑA+" TEXT)";

    public static final String ID_RESERVACION = "ID";
    public static final String C_CEDULAU = "Usuario";
    public static final String T_RESERVACION = "Reservacion";
    public static final String C_HORARIO = "Horario";
    public static final String C_MEDICO = "Medico";
    public static final String C_FR = "Fecha_Reservacion";
    public static final String CREAR_TABLA_RESERVACION = "CREATE TABLE "+T_RESERVACION+"( "+ID_RESERVACION+" INTEGER PRIMARY KEY AUTOINCREMENT, "+C_CEDULAU+" TEXT, "+C_HORARIO+" TEXT, "
            +""+C_FR+" TEXT, "+C_MEDICO+" TEXT)";

}
