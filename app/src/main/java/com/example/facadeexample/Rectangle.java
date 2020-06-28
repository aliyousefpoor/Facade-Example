package com.example.facadeexample;

import android.content.Context;
import android.widget.Toast;

public class Rectangle implements Shape {

    @Override
    public void draw(Context context) {

        Toast.makeText(context, "Rectangle Draw", Toast.LENGTH_LONG).show();

    }


}
