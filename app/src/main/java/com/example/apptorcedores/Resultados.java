package com.example.apptorcedores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Resultados extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);
        maisResultados();
    }

    public void telaPrincipal(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void maisResultados() {
        Button bt11 = (Button) findViewById(R.id.button11);

        bt11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.google.com/search?q=xv+piracicaba+ultimos+resultados&ie=utf-8&oe=utf-8&client=firefox-b-e#sie=t;/m/0280p2v;2;/m/0267n37;mt;fp;1;;"));
                startActivity(intent);
            }
        });
    }
}
