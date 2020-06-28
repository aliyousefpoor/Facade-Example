package com.example.facadeexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    Button CBtn,RBtn,SBtn;

    ShapeMaker shapeMaker = new ShapeMaker();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CBtn = findViewById(R.id.circle);
        RBtn = findViewById(R.id.rectangle);
        SBtn = findViewById(R.id.square);

        CBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                shapeMaker.drawCircle(getApplicationContext());
                Log.d(TAG, "onClick: ");


            }
        });

        RBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shapeMaker.drawRectangle(getApplicationContext());

            }
        });

        SBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shapeMaker.drawSqure(getApplicationContext());
            }
        });

    }
}