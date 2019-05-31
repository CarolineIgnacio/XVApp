package com.example.apptorcedores.Entidades;

import java.util.Calendar;

public class Jogo {

    private Time timeA5;
    private String nomeOponente;
    private Calendar dataJogo;
    private String localJogo;
    private String resultado;
    private String nomeGanhador;

    public Jogo(Time timeA5, String nomeOponente, Calendar dataJogo, String localJogo) {
        this.timeA5 = timeA5;
        this.nomeOponente = nomeOponente;
        this.dataJogo = dataJogo;
        this.localJogo = localJogo;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public void setNomeGanhador(String nomeGanhador) {
        this.nomeGanhador = nomeGanhador;
    }

    public Time getTimeA5() {
        return timeA5;
    }

    public String getNomeOponente() {
        return nomeOponente;
    }

    public Calendar getDataJogo() {
        return dataJogo;
    }

    public String getLocalJogo() {
        return localJogo;
    }

    public String getResultado() {
        return resultado;
    }

    public String getNomeGanhador() {
        return nomeGanhador;
    }

}
