package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
public class NovoProjeto extends AppCompatActivity {

    Button btnReturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calc_simples);

        btnReturn = findViewById(R.id.btnReturn);
        btnReturn.setOnClickListener(view -> {
            Intent in = new Intent(NovoProjeto.this, MainActivity.class);
            startActivity(in);
        });
    }
}
