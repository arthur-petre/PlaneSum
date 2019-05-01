package com.example.planesum;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int cpt = 0;
    String Check = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText metHours = findViewById(R.id.editTextHours);
        final EditText metMinutes = findViewById(R.id.editTextMinutes);
        final TextView mtxCheck = findViewById(R.id.textViewCheck);
        final Time temps = new Time(0, 0);
        Button mAdd = findViewById(R.id.buttonAdd);
        Button mReset = findViewById(R.id.buttonReset);
        mAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (metHours.getText().toString().contains("+") || metHours.getText().toString().contains("-") || metMinutes.getText().toString().contains("+") || metMinutes.getText().toString().contains("-")) {
                    metHours.setText("");
                    metMinutes.setText("");
                    metHours.requestFocus();
                } else if (metHours.getText().toString().equals("") && !(metMinutes.getText().toString().equals(""))) {
                    cpt = cpt + 1;
                    temps.addmyMinutes(Integer.parseInt(metMinutes.getText().toString()));
                } else if (metMinutes.getText().toString().equals("") && !(metHours.getText().toString().equals(""))) {
                    cpt = cpt + 1;
                    temps.addmyHours(Integer.parseInt(metHours.getText().toString()));
                } else if (!(metHours.getText().toString().equals("") || metMinutes.getText().toString().equals(""))) {
                    cpt = cpt + 1;
                    temps.addmyHours(Integer.parseInt(metHours.getText().toString()));
                    temps.addmyMinutes(Integer.parseInt(metMinutes.getText().toString()));
                }
                if (!(metHours.getText().toString().equals("") && metMinutes.getText().toString().equals(""))) {
                    temps.normaliser();
                    Check = "Dernier temps : " + metHours.getText().toString() + " h. " + metMinutes.getText().toString() + " m." + "\n" + "Nombre de temps : " + cpt + "\n" + "\n" + "Total : " + temps.getmyHours() + " h. " + temps.getmyMinutes() + " m.";
                    mtxCheck.setText(Check);
                    metHours.setText("");
                    metMinutes.setText("");
                    metHours.requestFocus();
                }
            }
        });
        mReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cpt = 0;
                temps.setmyHours(0);
                temps.setmyMinutes(0);
                metHours.setText("");
                metMinutes.setText("");
                mtxCheck.setText("");
            }
        });
    }
}
