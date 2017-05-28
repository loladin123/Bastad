package com.example.dat11nse.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void klick1(View view) {
        Intent intent = new Intent (this, TabelActivity.class);
        intent.putExtra("whichButton", "Avkoppling");
        startActivity(intent);

    }
    public void klick2(View view) {
        Intent intent = new Intent (this, TabelActivity.class);
        intent.putExtra("whichButton", "Cykling");
        startActivity(intent);

    }
    public void klick3(View view) {
        Intent intent = new Intent (this, TabelActivity.class);
        intent.putExtra("whichButton", "Golf");
        startActivity(intent);

    }
    public void klick4(View view) {
        Intent intent = new Intent (this, TabelActivity.class);
        intent.putExtra("whichButton", "Sevärdheter");
        startActivity(intent);

    }
    public void klick5(View view) {
        Intent intent = new Intent (this, TabelActivity.class);
        intent.putExtra("whichButton", "Tennis");
        startActivity(intent);

    }
    public void klick6(View view) {
        Intent intent = new Intent (this, TabelActivity.class);
        intent.putExtra("whichButton", "Vandring");
        startActivity(intent);

    }
}
