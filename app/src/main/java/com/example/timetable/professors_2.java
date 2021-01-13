package com.example.timetable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class professors_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_professors_2);
    }

    public void prev_prof(View view)
    {
        Intent intent = new Intent(this, Professors.class);
        startActivity(intent);
    }
}