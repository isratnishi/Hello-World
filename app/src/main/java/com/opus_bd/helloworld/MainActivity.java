package com.opus_bd.helloworld;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public static Random RANDOM = new Random();
    TextView tvHelloWorld;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvHelloWorld = findViewById(R.id.tvHelloWorld);

    }

    public void ChangeColor(View view) {

        int color = Color.argb(255, RANDOM.nextInt(256), RANDOM.nextInt(256), RANDOM.nextInt(256));
        tvHelloWorld.setTextColor(color);
    }
}
