package com.example.totalavion;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int cpt = 0;
    String mRslt = "";
    String Check = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText metHours = findViewById(R.id.editTextHours);
        final EditText metMinutes = findViewById(R.id.editTextMinutes);
        final TextView mtxResults = findViewById(R.id.textViewResults);
        final TextView mtxCheck = findViewById(R.id.textViewCheck);
        final Time temps = new Time(0, 0);
        Button mResults = findViewById(R.id.buttonResults);
        Button mAjouter = findViewById(R.id.buttonAdd);
        Button mReset = findViewById(R.id.buttonReset);

        mAjouter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!(metHours.getText().toString().equals("") || metMinutes.getText().toString().equals(""))) {
                    cpt = cpt + 1;
                    Check = "Last : " + metHours.getText().toString() + " h.  " + metMinutes.getText().toString() + " m." + "\n" + cpt;
                    //Check = "Last : " + metHours.getText().toString() + " h.  " + metMinutes.getText().toString() + " m." + "\n" + cpt + "\n" + "\n" + "Total : " + temps.getmyHours() + " h.  " + temps.getmyMinutes() + " m.";
                    temps.addmyHours(Integer.parseInt(metHours.getText().toString()));
                    temps.addmyMinutes(Integer.parseInt(metMinutes.getText().toString()));
                    mtxCheck.setText(Check);
                    metHours.setText("");
                    metMinutes.setText("");
                }
            }
        });

        mReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temps.setmyHours(0);
                temps.setmyMinutes(0);
                metHours.setText("");
                metMinutes.setText("");
                mtxResults.setText("");
            }
        });

        mResults.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mRslt = temps.getmyHours() + " h.  " + temps.getmyMinutes() + " m.";
                mtxResults.setText(mRslt);
            }
        });

    }
}
