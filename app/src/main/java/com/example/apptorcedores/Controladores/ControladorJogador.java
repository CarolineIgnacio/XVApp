package com.example.apptorcedores.Controladores;

public class ControladorJogador {

    public static ControladorJogador instance;

    public static ControladorJogador getInstance() {
        if (instance == null) {
            instance = new ControladorJogador();
            return instance;
        }
        return instance;
    }

}
