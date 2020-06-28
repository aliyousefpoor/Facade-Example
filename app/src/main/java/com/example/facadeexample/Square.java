package com.example.facadeexample;

import android.content.Context;
import android.widget.Toast;

public class Square implements Shape {

    @Override
    public void draw(Context context) {

        Toast.makeText(context,"Square Draw",Toast.LENGTH_LONG).show();

    }

}
