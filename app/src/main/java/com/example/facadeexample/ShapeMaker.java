package com.example.facadeexample;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ShapeMaker  {
    private static final String TAG = "ShapeMaker";
    private Shape circle;
    private Shape rectangle;
    private Shape square;


    

    public  ShapeMaker(){

        circle =  new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(Context context){
        circle.draw(context);
        

    }

    public void drawRectangle(Context context){
        rectangle.draw(context);
    }

    public void drawSqure(Context context){
        square.draw(context);
    }
}
