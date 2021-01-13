package com.example.timetable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class schedule_mon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule_mon);
    }

    public void profs(View view)
    {
        Intent intent = new Intent(this, daily_profs.class);
        String str = "mon";
        intent.putExtra("message_key",str);
        startActivity(intent);
    }
}