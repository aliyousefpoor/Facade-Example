package com.example.facadeexample;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.core.content.ContextCompat;

public class Circle implements Shape {
    private static final String TAG = "Circle";


    @Override
    public void draw(Context context) {
        Toast.makeText(context, "Circle Draw", Toast.LENGTH_LONG).show();
        Log.d(TAG, "draw: ");
    }

}
