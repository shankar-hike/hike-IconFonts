package com.example.shankaryadav.iconfonts;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Hashtable;

public class Icon_Managemnet extends AppCompatActivity {
    private TextView textView;

    private static Hashtable < String, Typeface > cached_icon = new Hashtable<>();

    String path = "Fonts/hike-font.ttf";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Typeface icon = cached_icon.get(path);

        if(icon == null) {

            icon = Typeface.createFromAsset(this.getAssets(), path);

            cached_icon.put(path, icon);
        }
        textView = (TextView)findViewById(R.id.textView);

        textView.setTypeface(icon);
    }
}
