package com.yong.apphomework3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

import java.net.URL;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnCocktailListener(View v){
        Bundle dateBoundle = new Bundle();
        dateBoundle.putString("name", "cockTail");
        dateBoundle.putInt("image", R.drawable.blue);

        Intent intent = new Intent();
        intent.setClass(this, cockTail.class);
        intent.putExtras(dateBoundle);
        startActivity(intent);
    }
    private void showFoodView(String foodName, int drawableImage){
        Bundle dataBundle = new Bundle();
        dataBundle.putString("name", foodName);
        dataBundle.putInt("image", drawableImage);
        Intent intent = new Intent();
        //getApplicationContext() mean the class you have stayed
        intent.setClass(getApplicationContext(), cockTail.class);
        intent.putExtras(dataBundle);
        startActivity(intent);

    }

    public void btnSoftDrinkListener(View v){
        showFoodView("softDrink", R.drawable.softdrink);

//        Bundle dateBoundle = new Bundle();
//        dateBoundle.putString("Sname", "softDrink");
//        dateBoundle.putInt("Simage", R.drawable.softdrink);
//
//        Intent intent = new Intent();
//        intent.setClass(this, softDrink.class);
//        intent.putExtras(dateBoundle);
//        startActivity(intent);
    }

    public void btnEnergyListener(View v){
        Bundle dateBoundle = new Bundle();
        dateBoundle.putString("Ename", "energyDrink");
        dateBoundle.putInt("Eimage", R.drawable.energydrink);

        Intent intent = new Intent();
        intent.setClass(this, energyDrink.class);
        intent.putExtras(dateBoundle);
        startActivity(intent);
    }

    public void callListener(View v){
        Uri number = Uri.parse("tel:0973784908");
        Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
        startActivity(callIntent);
    }

    public void searchListener(View v){
        Uri webpage = Uri.parse("https://developer.android.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

}