package com.example.timetable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click_mon(View view)
    {
        Intent intent = new Intent(this, schedule_mon.class);
        startActivity(intent);
    }
    public void click_tue(View view)
    {
        Intent intent = new Intent(this, schedule_tuesday.class);
        startActivity(intent);
    }
    public void click_wed(View view)
    {
        Intent intent = new Intent(this, schedule_wed.class);
        startActivity(intent);
    }
    public void click_thu(View view)
    {
        Intent intent = new Intent(this, schedule_thu.class);
        startActivity(intent);
    }
    public void click_fri(View view)
    {
        Intent intent = new Intent(this, schedule_fri.class);
        startActivity(intent);
    }
    public void click_sat(View view)
    {
        Intent intent = new Intent(this, schedule_sat.class);
        startActivity(intent);
    }
    public void click_profs(View view)
    {
        Intent intent = new Intent(this, Professors.class);
        startActivity(intent);
    }
}