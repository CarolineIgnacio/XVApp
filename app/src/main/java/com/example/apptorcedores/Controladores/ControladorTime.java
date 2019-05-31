package com.example.apptorcedores.Controladores;

public class ControladorTime {

    public static ControladorTime instance;

    public static ControladorTime getInstance() {
        if (instance == null) {
            instance = new ControladorTime();
            return instance;
        }
        return instance;
    }

}
