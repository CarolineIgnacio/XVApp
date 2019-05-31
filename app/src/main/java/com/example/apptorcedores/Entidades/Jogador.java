package com.example.apptorcedores.Entidades;

import java.util.Calendar;

public class Jogador {

    private String nome;
    private String idade;
    private String posicao;
    private Calendar entrouNoTime;
    private String infosAdicionais;

    public Jogador(String nome, String idade, String posicao, Calendar entrouNoTime) {
        this.nome = nome;
        this.idade = idade;
        this.posicao = posicao;
        this.entrouNoTime = entrouNoTime;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public void setInfosAdicionais(String infosAdicionais) {
        this.infosAdicionais = infosAdicionais;
    }

    public String getNome() {
        return nome;
    }

    public String getIdade() {
        return idade;
    }

    public String getPosicao() {
        return posicao;
    }

    public Calendar getEntrouNoTime() {
        return entrouNoTime;
    }

    public String getInfosAdicionais() {
        return infosAdicionais;
    }

}
