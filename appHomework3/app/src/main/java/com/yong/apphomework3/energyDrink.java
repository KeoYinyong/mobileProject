package com.yong.apphomework3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class energyDrink extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_energy_drink);

        Bundle dataBoudle = getIntent().getExtras();
        String energyName = dataBoudle.getString("Ename");
        Drawable energyImg = getResources().getDrawable(dataBoudle.getInt("Eimage"));
        TextView textView = (TextView) findViewById(R.id.enertextview);
        ImageView imageView = (ImageView) findViewById(R.id.enerimgview);
        textView.setText(energyName);
        imageView.setImageDrawable(energyImg);

    }
}