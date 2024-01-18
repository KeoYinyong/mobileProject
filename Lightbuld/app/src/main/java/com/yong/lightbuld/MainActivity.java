package com.yong.lightbuld;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeIU();
    }

    private void initializeIU() {
        ImageView bultImg = (ImageView) findViewById(R.id.offImageView);
        bultImg.setOnClickListener(imgListener);
    }

    /**
     * Handle convert button click
     */
    private View.OnClickListener imgListener = new View.OnClickListener() {
        public void onClick(View v) {
            onOffImageClick();
        }
    };

    private void onOffImageClick() {

        ImageView bultImage = (ImageView) findViewById(R.id.offImageView);
        if (bultImage.getTag() != null && bultImage.getTag().toString().equals("off")) {
            bultImage.setImageDrawable(getResources().getDrawable(R.drawable.onlight));
            bultImage.setTag("on");
        } else {
            bultImage.setImageDrawable(getResources().getDrawable(R.drawable.offlight));
            bultImage.setTag("off");
        }

    }
}