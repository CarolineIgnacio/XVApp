package com.example.apptorcedores.Telas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.apptorcedores.R;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void telaInfo(View view) {
        Intent intent = new Intent(this, Info.class);
        startActivity(intent);
    }

    public void telaNoticias(View view) {
        Intent intent = new Intent(this, Noticias.class);
        startActivity(intent);
    }

    public void telaAgenda(View view) {
        Intent intent = new Intent(this, Agenda.class);
        startActivity(intent);
    }

    public void telaResultados(View view) {
        Intent intent = new Intent(this, Resultados.class);
        startActivity(intent);
    }

    public void telaVideos(View view) {
        Intent intent = new Intent(this, Videos.class);
        startActivity(intent);
    }
}
