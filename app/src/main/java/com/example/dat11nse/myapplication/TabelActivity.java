package com.example.dat11nse.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TabelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String knapp = intent.getStringExtra("whichButton");
        TextView t = (TextView) findViewById(R.id.textView3);
        setContentView(R.layout.activity_tabel);
    }
}
