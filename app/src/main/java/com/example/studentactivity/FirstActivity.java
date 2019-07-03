package com.example.studentactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FirstActivity extends AppCompatActivity implements View.OnClickListener {
    EditText ett1,ett2,ett3;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        ett1 =findViewById(R.id.et1);
        ett2 =findViewById(R.id.et2);
        ett3 =findViewById(R.id.et3);

        btn =findViewById(R.id.btn_show);

        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        String name=ett1.getText().toString();
        int num1=Integer.parseInt(ett2.getText().toString());
        int num2=Integer.parseInt(ett3.getText().toString());

        Intent i=new Intent(this,SecondActivity.class);

        i.putExtra("Student name",name);
        i.putExtra("student number",num1);
        i.putExtra("student marks",num2);

        startActivity(i);

    }
}
