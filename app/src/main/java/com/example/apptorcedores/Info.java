package com.example.apptorcedores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.text.SpannedString;
import android.view.View;
import android.widget.TextView;

public class Info extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        //setText();
    }

    public void telaPrincipal(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    /*public void setText() {
        TextView tView3 = (TextView) findViewById(R.id.textView3);

        String texto = "Jeitos de colocar <b>o texto negrito</b> em um TextView";
        tView3.setText(texto);
    }*/

}
