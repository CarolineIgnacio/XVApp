package com.example.apptorcedores.Telas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.apptorcedores.R;

public class Noticias extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noticias);
        newsWebPage();
    }

    public void telaPrincipal(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void newsWebPage() {
        TextView tView7 = (TextView) findViewById(R.id.textView7);
        TextView tView8 = (TextView) findViewById(R.id.textView8);
        TextView tView9 = (TextView) findViewById(R.id.textView9);
        TextView tView10 = (TextView) findViewById(R.id.textView10);
        TextView tView11 = (TextView) findViewById(R.id.textView11);
        TextView tView12 = (TextView) findViewById(R.id.textView12);

        tView7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://www.xvpiracicaba.com.br/base/sub-15-e-sub-17-saem-na-frente-mas-sofrem-viradas-pelo-paulista/"));
                startActivity(intent);
            }
        });

        tView8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://www.xvpiracicaba.com.br/base/sub-20-vence-o-botafogo-fora-de-casa-e-assume-terceira-colocacao-sub-15-e-sub-17-enfrentam-o-guarani-na-manha-deste-sabado-em-morungaba/"));
                startActivity(intent);
            }
        });

        tView9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://www.xvpiracicaba.com.br/base/comissao-utiliza-inicio-de-intertemporada-para-realizar-trabalhos-preventivos-contra-lesoes/"));
                startActivity(intent);
            }
        });

        tView10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://www.xvpiracicaba.com.br/futebol/ricardo-moura-e-beto-souza-exaltam-manutencao-do-elenco-primeiro-jogo-treino-e-agendado/"));
                startActivity(intent);
            }
        });

        tView11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://www.xvpiracicaba.com.br/futebol/com-kadu-barone-integrado-elenco-volta-aos-trabalhos/"));
                startActivity(intent);
            }
        });

        tView12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://www.xvpiracicaba.com.br/base/sub-15-e-sub-17-vencem-com-larga-vantagem-no-placar-sub-20-tropeca-fora-de-casa/"));
                startActivity(intent);
            }
        });
    }

}
