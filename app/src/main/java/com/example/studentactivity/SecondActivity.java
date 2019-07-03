package com.example.studentactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity  {
    TextView tvv1,tvv2,tvv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvv1 = findViewById(R.id.tv1);
        tvv2 = findViewById(R.id.tv2);
        tvv3 = findViewById(R.id.tv3);


        Intent i = getIntent();
        String name = i.getStringExtra("Student name");
        int num1 = (int) i.getIntExtra("student number", 0);
        int num2 = (int) i.getIntExtra("student marks", 0);

        tvv1.setText(name);
        tvv2.setText(String.valueOf(num1));
        tvv3.setText(String.valueOf(num2));


    }
}
