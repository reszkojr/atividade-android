package com.example.myapplication.calcs.calcenvioresult;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.MainActivity;
import com.example.myapplication.R;

public class CalcEnvioResult extends AppCompatActivity {

    Button btnReturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calc_envio_result);

        btnReturn = findViewById(R.id.btnReturn);
        btnReturn.setOnClickListener(view -> {
            Intent in = new Intent(CalcEnvioResult.this, MainActivity.class);
            startActivity(in);
        });
    }
}
