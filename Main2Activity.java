package com.example.experiment3;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;

import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity
{
    TextView t1; String msg="";
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t1 = findViewById(R.id.welcome);
        Intent intent = getIntent();
        msg = intent.getStringExtra("message");
        t1.setText("Welcome " + msg);
    }
}