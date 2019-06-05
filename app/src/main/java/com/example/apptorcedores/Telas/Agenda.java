package com.example.apptorcedores.Telas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.apptorcedores.Maps.FirstMapsActivity;
import com.example.apptorcedores.Maps.SecondMapsActivity;
import com.example.apptorcedores.R;

public class Agenda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agenda);
    }

    public void telaPrincipal(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void localPrimeiroJogo(View view) {
        Intent intent = new Intent(this, FirstMapsActivity.class);
        startActivity(intent);
    }

    public void localSegundoJogo(View view) {
        Intent intent = new Intent(this, SecondMapsActivity.class);
        startActivity(intent);
    }


}
