package com.example.user.trimiteredateintreaplicatii;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText etNume, etPrenume;
    Button btnActivity2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNume = (EditText) findViewById(R.id.etNume);
        etPrenume = (EditText) findViewById(R.id.etPrenume);
        btnActivity2 = (Button) findViewById(R.id.btnActivity2);
        btnActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nume = etNume.getText().toString().trim();
                String prenume = etPrenume.getText().toString().trim();
                Intent intent = new Intent(MainActivity.this, com.example.user.trimiteredateintreaplicatii.Main2Activity.class);
                intent.putExtra("username",nume);
                intent.putExtra("username1",prenume);
                startActivity(intent); }
        });



    }
}
