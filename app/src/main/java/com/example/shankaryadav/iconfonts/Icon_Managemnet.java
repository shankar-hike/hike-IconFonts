package com.example.shankaryadav.iconfonts;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Hashtable;
import java.util.TimeZone;

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

        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT+5:30"));

        Date StartTime = cal.getTime();

        DateFormat date = new SimpleDateFormat("HH:mm:ss:ms");

        date.setTimeZone(TimeZone.getTimeZone("GMT+5:30"));

        String Start_Time = date.format(StartTime);

        Log.i("Start Time.......", Start_Time);



        textView = (TextView)findViewById(R.id.textView);

        textView.setTypeface(icon);

        textView1 = (TextView)findViewById(R.id.textView1);


        imagePragmatically = (ImageView) findViewById(R.id.im);

        imagePragmatically.setImageResource(R.drawable.new_icon_vd);

        imagePragmatically = (ImageView) findViewById(R.id.im2);

        imagePragmatically.setImageResource(R.drawable.car_police);


        Date EndTime = cal.getTime();

        DateFormat date1 = new SimpleDateFormat("HH:mm:ss:ms");

        date1.setTimeZone(TimeZone.getTimeZone("GMT+5:30"));

        String End_Time = date1.format(EndTime);

        Log.i("End Time.......", End_Time);
    }
}
