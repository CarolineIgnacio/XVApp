package com.example.apptorcedores.Controladores;

public class ControladorJogo {

    public static ControladorJogo instance;

    public static ControladorJogo getInstance() {
        if (instance == null) {
            instance = new ControladorJogo();
            return instance;
        }
        return instance;
    }

}
