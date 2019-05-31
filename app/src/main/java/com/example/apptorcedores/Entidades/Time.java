package com.example.apptorcedores.Entidades;

import java.util.ArrayList;

public class Time {

    private String nome;
    private ArrayList<Jogador> jogadores;
    private ArrayList<Jogo> jogos;
    private Agenda agenda;

    public Time(String nome) {
        this.nome = nome;
        this.agenda = new Agenda();
        this.jogadores = new ArrayList<>();
        this.jogos = new ArrayList<>();
    }

    public Agenda getAgenda() {
        return agenda;
    }

    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
    }

    public ArrayList<Jogador> getJogadores() {
        return jogadores;
    }

    public ArrayList<Jogo> getJogos() {
        return jogos;
    }
}
