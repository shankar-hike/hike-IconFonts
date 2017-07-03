package com.example.shankaryadav.iconfonts;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Hashtable;

public class Icon_Managemnet extends AppCompatActivity {

    private TextView textView;
    private TextView textView1;


    private ImageView imagePragmatically;

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

        long StartTime = System.currentTimeMillis();

        textView = (TextView)findViewById(R.id.textView);

        textView.setTypeface(icon);

        textView1 = (TextView)findViewById(R.id.textView1);


        imagePragmatically = (ImageView) findViewById(R.id.im);

        imagePragmatically.setImageResource(R.drawable.new_icon_vd);

        imagePragmatically = (ImageView) findViewById(R.id.im2);

        imagePragmatically.setImageResource(R.drawable.car_police);

        long EndTime = System.currentTimeMillis();

        Log.i("Starting Time   ", Integer.toString((int) StartTime).toString() + " ms");

        Log.i("Ending Time   ", Integer.toString((int) EndTime).toString() + " ms");

        Log.i("Run Time in   ", Integer.toString((int) (EndTime - StartTime)).toString() + " ms");
    }
}
