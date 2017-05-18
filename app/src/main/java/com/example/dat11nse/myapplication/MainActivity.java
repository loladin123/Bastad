package com.example.dat11nse.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void klick(View view) {
            Intent intent = new Intent (this, Main2Activity.class);
            startActivity(intent);

    }

    public void klick2(View view) {
        Intent intent = new Intent (this, Main3Activity.class);
        startActivity(intent);

    }
    public void klick3(View view) {
        Intent intent = new Intent (this, Main4Activity.class);
        startActivity(intent);

    }

    public void klick4(View view) {
        Intent intent = new Intent (this, TabelActivity.class);
        intent.putExtra("whichButton", "Knapp4");
        startActivity(intent);

    }
    public void klick5(View view) {
        Intent intent = new Intent (this, TabelActivity.class);
        intent.putExtra("whichButton", "Knapp5");
        startActivity(intent);

    }
    public void klick6(View view) {
        Intent intent = new Intent (this, TabelActivity.class);
        intent.putExtra("whichButton", "Knapp6");
        startActivity(intent);

    }
}
