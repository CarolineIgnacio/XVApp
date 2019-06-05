package com.example.apptorcedores.Telas;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.apptorcedores.R;

import java.util.ArrayList;


public class Info extends AppCompatActivity {

    ArrayList<String> dados1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        listView();
    }

    public void listView() {
        ListView listview = (ListView) findViewById(R.id.listView);
        dados1 = new ArrayList<>();
        infoJogadores();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_white_item, dados1);
        listview.setAdapter(adapter);
    }


    public void infoJogadores() {
        String Jogador1 = "Nome: Fábio Gonçalves dos Santos" + "\n" +  "Goleiro" + "\n" + "Estreia no time: Estreou contra a Internacional (no Major José Levy Sobrinho, em Limeira) no dia 19 de janeiro de 2019, em partida válida pelo Paulistão A2, e o jogo terminou com vitória do XV por 3 a 2." + "\n";
        String Jogador2 = "Nome: Jefferson da Silva Luciano" + "\n" +  "Lateral-direito" + "\n" + "Estreia no time: Estreou contra a Internacional (no Major José Levy Sobrinho, em Limeira) no dia 19 de janeiro de 2019, em partida válida pelo Campeonato Paulista Série A2, e o jogo terminou com vitória do XV por 3 a 2" + "\n";
        String Jogador3 = "Nome: Anderson Santos da Vitória" + "\n" +  "Lateral-esquerdo" + "\n" + "Estreia no time: Estreou contra o Juventus (no Barão da Serra Negra, em Piracicaba) no dia 4 de abril de 2019, em partida válida pelo Campeonato Paulista Série A2, e o jogo terminou com vitória do XV por 1 a 0" + "\n";
        String Jogador4 = "Nome: Douglas Marques dos Santos" + "\n" +  "Zagueiro" + "\n" + "Estreia no time: Estreou contra a Internacional (no Major José Levy Sobrinho, em Limeira) no dia 19 de janeiro de 2019, em partida válida pelo Campeonato Paulista Série A2, e o jogo terminou com vitória do XV por 3 a 2" + "\n";
        String Jogador5 = "Nome: Paulo Eduardo Rodrigues Lima" + "\n" +  "Zagueiro" + "\n" + "Estreia no time: Estreou contra o Juventus (no Barão da Serra Negra, em Piracicaba) no dia 4 de abril de 2019, em partida válida pelo Campeonato Paulista Série A2, e o jogo terminou com vitória do XV por 1 a 0" + "\n";
        String Jogador6 = "Nome: Francisco Elias Eufrásio" + "\n" +  "Volante" + "\n" + "Estreia no time: Estreou contra a Portuguesa (no Barão da Serra Negra, em Piracicaba) no dia 23 de janeiro de 2019, em partida válida pelo Campeonato Paulista Série A2, e o jogo terminou com vitória do XV por 2 a 0" + "\n";
        String Jogador11 = "Nome: Bruno Felipe Lima Teixeira" + "\n" +  "Volante" + "\n" + "Estreia no time: Estreou contra a Portuguesa (no Barão da Serra Negra, em Piracicaba) no dia 23 de janeiro de 2019, em partida válida pelo Campeonato Paulista Série A2, e o jogo terminou com vitória do XV por 2 a 0" + "\n";
        String Jogador7 = "Nome: Cássio Gabriel Vilela Ferreira" + "\n" +  "Meio-campista" + "\n" + "Estreia no time: Estreou contra o Noroeste (no Dr. Alfredo de Castilho, em Bauru) no dia 8 de agosto de 2018, em partida válida pela Copa Paulista, e o jogo terminou empatado em 1 a 1" + "\n";
        String Jogador8 = "Nome: Danilo Petrolli Bueno" + "\n" +  "Meio-campista" + "\n" + "Estreia no time: Estreou contra a Internacional (no Major José Levy Sobrinho, em Limeira) no dia 19 de janeiro de 2019, em partida válida pelo Campeonato Paulista Série A2, e o jogo terminou com vitória do XV por 3 a 2" + "\n";
        String Jogador9 = "Nome: Carlos Eduardo Barone Barboza" + "\n" +  "Atacante" + "\n" + "Estreia no time: Estreou contra a Internacional (no Major José Levy Sobrinho, em Limeira) no dia 19 de janeiro de 2019, em partida válida pelo Campeonato Paulista Série A2, e o jogo terminou com vitória do XV por 3 a 2" + "\n";
        String Jogador10 = "Nome: Luiz Henrique Mendes Silva da Costa" + "\n" +  "Atacante" + "\n" + "Estreia no time: Estreou contra a Portuguesa Santista (no Ulrico Mursa, em Santos) no dia 13 de fevereiro de 2019, em partida válida pelo Paulistão A2, e o jogo terminou com vitória do adversário por 4 a 3" + "\n";

        dados1.add(Jogador1);
        dados1.add(Jogador2);
        dados1.add(Jogador3);
        dados1.add(Jogador4);
        dados1.add(Jogador5);
        dados1.add(Jogador6);
        dados1.add(Jogador7);
        dados1.add(Jogador8);
        dados1.add(Jogador9);
        dados1.add(Jogador10);
        dados1.add(Jogador11);
    }


    public void telaPrincipal(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }



}
