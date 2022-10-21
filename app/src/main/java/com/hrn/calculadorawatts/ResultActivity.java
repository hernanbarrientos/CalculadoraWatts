package com.hrn.calculadorawatts;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.text.DecimalFormat;

public class ResultActivity extends AppCompatActivity {

    TextView result;
    Float watts;
    Float hours;
    Float days;
    Float calc;
    double reals;
    String strResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        result = findViewById(R.id.ResultView);

        Intent intent = getIntent();
        watts = Float.parseFloat(intent.getStringExtra("watts"));
        hours = Float.parseFloat(intent.getStringExtra("hours"));
        days = Float.parseFloat(intent.getStringExtra("days"));
        calc = (watts * hours / 1000) * days;
        reals = 1.04 * calc;


        strResult = "Esse equipamento irá consumir " + calc + " Kwh" + "\n" +
                "Sendo utilizado por " + Integer.parseInt(intent.getStringExtra("hours")) + " horas" + "\n" +
                "e durante " + Integer.parseInt(intent.getStringExtra("days")) + " dias" + "\n" +
                "Totalizando R$" + new DecimalFormat("0.00").format(reals);

        result.setText(strResult);

    }
}