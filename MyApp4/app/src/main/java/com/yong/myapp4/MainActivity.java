package com.yong.myapp4;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
        Button getInfordetail = (Button) findViewById(R.id.getInforDetail);
        getInfordetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void  onClick(View v){
                Intent intent = new Intent(getApplicationContext(),Form.class);

                startActivityForResult(intent, 1);
            }
        });
    }


    public void onActivityResult(int requestCodee, int resultCode, Intent data){
        super.onActivityResult(requestCodee, resultCode,data);
        TextView fullNameTextview = (TextView) findViewById(R.id.fullNametxt);
        TextView StateTextview = (TextView) findViewById(R.id.txtState);
        if(requestCodee == 1){
            if (resultCode == RESULT_OK){
                String strGettxtfullName = "Name : "+data.getStringExtra("lastNameValue")+" "+data.getStringExtra("firstNameValue");
                fullNameTextview.setText((strGettxtfullName));

                String strState = "Stat : "+data.getStringExtra("stateValue");
                StateTextview.setText((strState));

            }
        }
    }


}