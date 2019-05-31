package com.example.apptorcedores.Controladores;

public class ControladorAgenda {

    public static ControladorAgenda instance;

    public static ControladorAgenda getInstance() {
        if (instance == null) {
            instance = new ControladorAgenda();
            return instance;
        }
        return instance;
    }
}
