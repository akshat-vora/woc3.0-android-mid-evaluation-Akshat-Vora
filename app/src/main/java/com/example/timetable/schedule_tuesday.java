package com.example.timetable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class schedule_tuesday extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule_tuesday);
    }
    public void profs(View view)
    {
        Intent intent = new Intent(this, daily_profs.class);
        String str = "tue";
        intent.putExtra("message_key",str);
        startActivity(intent);
    }
}