package com.example.timetable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class daily_profs extends AppCompatActivity {

    String rcvd_msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_profs);
        Intent intent = getIntent();
        rcvd_msg = intent.getStringExtra("message_key");
        if(rcvd_msg.equals("mon"))
            prof_mon();
        else if(rcvd_msg.equals("tue"))
            prof_tue();
        else if(rcvd_msg.equals("wed"))
            prof_wed();
        else if(rcvd_msg.equals("thu"))
            prof_thu();
        else if(rcvd_msg.equals("fri"))
            prof_fri();

    }

    protected void prof_mon()
    {
        TextView tw_sub_1 = (TextView)findViewById(R.id.textView24);
        TextView tw_sub_2 = (TextView)findViewById(R.id.textView27);
        TextView tw_sub_3 = (TextView)findViewById(R.id.textView30);

        tw_sub_1.setText("IT215- Systems Software (JP/SB)");
        tw_sub_2.setText("EL213- Analog Circuits (RP/TKM)");
        tw_sub_3.setText("SC209- Environmental Studies (RG)");

        TextView tw_prof_1 = (TextView)findViewById(R.id.textView25);
        TextView tw_prof_2 = (TextView)findViewById(R.id.textView26);
        TextView tw_prof_3 = (TextView)findViewById(R.id.textView28);
        TextView tw_prof_4 = (TextView)findViewById(R.id.textView29);
        TextView tw_prof_5 = (TextView)findViewById(R.id.textView31);
        TextView tw_prof_6 = (TextView)findViewById(R.id.textView32);

        tw_prof_1.setText("JP: Jay Prakash");
        tw_prof_2.setText("SB: Shruti Bhilare");
        tw_prof_3.setText("RP: Rutu Parekh");
        tw_prof_4.setText("TKM: Tapas Kumar Maiti");
        tw_prof_5.setText("RG: Ranendu Ghosh");
        tw_prof_6.setText("Common professor for both");
    }
    protected void prof_tue()
    {
        TextView tw_sub_1 = (TextView)findViewById(R.id.textView24);
        TextView tw_sub_2 = (TextView)findViewById(R.id.textView27);
        TextView tw_sub_3 = (TextView)findViewById(R.id.textView30);

        tw_sub_1.setText("CT215- Analog Communication and Transmission Line Theory (DKG/SG)");
        tw_sub_2.setText("Break");
        tw_sub_3.setText("SC221- Engineered Materials (AKR)");

        TextView tw_prof_1 = (TextView)findViewById(R.id.textView25);
        TextView tw_prof_2 = (TextView)findViewById(R.id.textView26);
        TextView tw_prof_3 = (TextView)findViewById(R.id.textView28);
        TextView tw_prof_4 = (TextView)findViewById(R.id.textView29);
        TextView tw_prof_5 = (TextView)findViewById(R.id.textView31);
        TextView tw_prof_6 = (TextView)findViewById(R.id.textView32);

        tw_prof_1.setText("DKG: Deepak Ghodgaonkar");
        tw_prof_2.setText("SG: Sanjeev Gupta");
        tw_prof_3.setText("");
        tw_prof_4.setText("");
        tw_prof_5.setText("AKR: Anil Roy ");
        tw_prof_6.setText("Common professor for both");
    }
    protected void prof_wed()
    {
        TextView tw_sub_1 = (TextView)findViewById(R.id.textView24);
        TextView tw_sub_2 = (TextView)findViewById(R.id.textView27);
        TextView tw_sub_3 = (TextView)findViewById(R.id.textView30);

        tw_sub_1.setText("SC209- Environmental Studies (RG)");
        tw_sub_2.setText("SC222- Probability Statistics and Information Theory (GG/MS)");
        tw_sub_3.setText("CS201- Introductory Computational Physics (AR)");

        TextView tw_prof_1 = (TextView)findViewById(R.id.textView25);
        TextView tw_prof_2 = (TextView)findViewById(R.id.textView26);
        TextView tw_prof_3 = (TextView)findViewById(R.id.textView28);
        TextView tw_prof_4 = (TextView)findViewById(R.id.textView29);
        TextView tw_prof_5 = (TextView)findViewById(R.id.textView31);
        TextView tw_prof_6 = (TextView)findViewById(R.id.textView32);

        tw_prof_1.setText("RG: Ranendu Ghosh");
        tw_prof_2.setText("Common professor for both");
        tw_prof_3.setText("GG: Gagan Garg");
        tw_prof_4.setText("MS: Madhukant Sharma");
        tw_prof_5.setText("AR: Arnab Ray");
        tw_prof_6.setText("");
    }
    protected void prof_thu()
    {
        TextView tw_sub_1 = (TextView)findViewById(R.id.textView24);
        TextView tw_sub_2 = (TextView)findViewById(R.id.textView27);
        TextView tw_sub_3 = (TextView)findViewById(R.id.textView30);

        tw_sub_1.setText("CT215- Analog Communication and Transmission Line Theory (DKG/SG)");
        tw_sub_2.setText("IT215- Systems Software (JP/SB)");
        tw_sub_3.setText("EL213- Analog Circuits (RP/TKM)");

        TextView tw_prof_1 = (TextView)findViewById(R.id.textView25);
        TextView tw_prof_2 = (TextView)findViewById(R.id.textView26);
        TextView tw_prof_3 = (TextView)findViewById(R.id.textView28);
        TextView tw_prof_4 = (TextView)findViewById(R.id.textView29);
        TextView tw_prof_5 = (TextView)findViewById(R.id.textView31);
        TextView tw_prof_6 = (TextView)findViewById(R.id.textView32);

        tw_prof_1.setText("DKG: Deepak Ghodgaonkar");
        tw_prof_2.setText("SG: Sanjeev Gupta");
        tw_prof_3.setText("JP: Jay Prakash");
        tw_prof_4.setText("SB: Shruti Bhilare");
        tw_prof_5.setText("RP: Rutu Parekh");
        tw_prof_6.setText("TKM: Tapas Kumar Maiti");
    }
    protected void prof_fri()
    {
        TextView tw_sub_1 = (TextView)findViewById(R.id.textView24);
        TextView tw_sub_2 = (TextView)findViewById(R.id.textView27);
        TextView tw_sub_3 = (TextView)findViewById(R.id.textView30);

        tw_sub_1.setText("SC221- Engineered Materials (AKR)");
        tw_sub_2.setText("CS201- Introductory Computational Physics (AR)");
        tw_sub_3.setText("SC222- Probability Statistics and Information Theory (GG/MS)");

        TextView tw_prof_1 = (TextView)findViewById(R.id.textView25);
        TextView tw_prof_2 = (TextView)findViewById(R.id.textView26);
        TextView tw_prof_3 = (TextView)findViewById(R.id.textView28);
        TextView tw_prof_4 = (TextView)findViewById(R.id.textView29);
        TextView tw_prof_5 = (TextView)findViewById(R.id.textView31);
        TextView tw_prof_6 = (TextView)findViewById(R.id.textView32);

        tw_prof_1.setText("AKR: Anil Roy");
        tw_prof_2.setText("Common professor for both");
        tw_prof_3.setText("AR: Arnab Ray");
        tw_prof_4.setText("");
        tw_prof_5.setText("GG: Gagan Garg");
        tw_prof_6.setText("MS: Madhukant Sharma");
    }

}