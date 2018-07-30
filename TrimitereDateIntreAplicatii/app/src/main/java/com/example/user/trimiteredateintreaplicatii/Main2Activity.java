package com.example.user.trimiteredateintreaplicatii;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView tvNume, tvPrenume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        String nume = getIntent().getStringExtra("username");
        String prenume = getIntent().getStringExtra("username1");
        tvNume = (TextView) findViewById(R.id.tvNume);
        tvPrenume = (TextView) findViewById(R.id.tvPrenume);
        tvNume.setText(nume);
        tvPrenume.setText(prenume);

        String fnume = getIntent().getStringExtra("username");
        String fprenume = getIntent().getStringExtra("username1");




        }

    }

