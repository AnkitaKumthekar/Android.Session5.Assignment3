package com.example.akcreation.explicitintentexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
TextView course;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        course =(TextView)findViewById(R.id.tv_course);
        String value = getIntent().getExtras().getString("key");


        if(value.equals( "Linux Fundamentals"))
        {
            course.setText("Mentor 1");
        }
        if(value.equals( "Scala Programing"))
        {
            course.setText("Mentor 2");
        }
        if(value.equals( "Android Development"))
        {
            course.setText("Mentor 3");
        }
        if(value.equals( "Frontend Web Development"))
        {
            course.setText("Mentor 4");
        }
        if(value.equals( "Big Data and Hadloop Development"))
        {
            course.setText("Mentor 5");
        }
        if(value.equals( "Node JS"))
        {
            course.setText("Mentor 6");
        }
        if(value.equals( "Advance J2EE"))
        {
            course.setText("Mentor 7");
        }
        if(value.equals( "Core Java"))
        {
            course.setText("Mentor 8");
        }
    }
}
