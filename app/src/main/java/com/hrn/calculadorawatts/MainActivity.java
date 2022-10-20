package com.hrn.calculadorawatts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText watts,hours,days;
    Button buttonCalc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        watts = (EditText) findViewById(R.id.editTextWatts);
        hours = (EditText) findViewById(R.id.editTextHours);
        days = (EditText) findViewById(R.id.editTextDays);
        buttonCalc =(Button) findViewById(R.id.buttonCalc);

        buttonCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showResult();
            }
        });
    }

    public void showResult(){
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("watts",watts.getText().toString());
        intent.putExtra("hours",hours.getText().toString());
        intent.putExtra("days",days.getText().toString());
        startActivity(intent);


    }
}