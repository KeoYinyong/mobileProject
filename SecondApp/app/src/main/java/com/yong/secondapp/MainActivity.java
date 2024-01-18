package com.yong.secondapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //connect to views
        Button convertButton = (Button)findViewById(R.id.convertButton);
        EditText inputTempText = (EditText) findViewById(R.id.editText);
        TextView convertedText = (TextView) findViewById(R.id.convertTempView);

        //handle button even listener
        convertButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                String fstr = convertToFh(inputTempText.getText().toString());
                convertedText.setText(fstr + "F");
            }
        });
    }
    private String convertToFh(String pCelius)
    {
        try {
            //conver text to double
            double c = Double.parseDouble(pCelius);
            double f = c * (9.0/5.0) + 32.0;
            //return and convert from Double to String
            return String.format("%3.2f", f);
        }
        catch (NumberFormatException nfe){
            return "ERR";
        }
    }

}