package com.hrn.calculadorawatts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText watts, hours, days;
    Button buttonCalc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        watts =  findViewById(R.id.editTextWatts);
        hours =  findViewById(R.id.editTextHours);
        days =  findViewById(R.id.editTextDays);
        buttonCalc = findViewById(R.id.buttonCalc);

        buttonCalc.setOnClickListener(view -> showResult());
    }

    public void showResult() {
        if(TextUtils.isEmpty(watts.getText().toString())){
            watts.setError("Campo obrigatório!");
            return;
        }
        if(TextUtils.isEmpty(hours.getText().toString())){
            hours.setError("Campo obrigatório!");
            return;
        }


        if(TextUtils.isEmpty(days.getText().toString())){
            days.setError("Campo obrigatório!");
            return;
        }

            Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("watts", watts.getText().toString());
        intent.putExtra("hours", hours.getText().toString());
        intent.putExtra("days", days.getText().toString());
        startActivity(intent);


    }
}