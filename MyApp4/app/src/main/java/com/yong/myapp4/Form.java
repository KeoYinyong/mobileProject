package com.yong.myapp4;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Form extends AppCompatActivity {
    EditText firstName;
    EditText lastName;
    EditText state;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        firstName = (EditText) findViewById(R.id.editfirstName);
        lastName = (EditText) findViewById(R.id.editlastText);
        EditText state = (EditText) findViewById(R.id.editState);
        Button btnBack = (Button) findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("firstNameValue", firstName.getText().toString());
                intent.putExtra("lastNameValue", lastName.getText().toString());
                intent.putExtra("stateValue", state.getText().toString());

                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }


    public void onBackPress() {
        Log.i("Result Detail", "Back Button Pressed");
        firstName = (EditText) findViewById(R.id.editfirstName);
        lastName = (EditText) findViewById(R.id.editlastText);
        state = (EditText) findViewById(R.id.editState);

        Intent intent = new Intent();
        intent.putExtra("firstNameValue", firstName.getText().toString());
        intent.putExtra("lastNameValue", lastName.getText().toString());
        intent.putExtra("stateValue", state.getText().toString());

        setResult(RESULT_OK, intent);

        super.getOnBackPressedDispatcher();
    }
}