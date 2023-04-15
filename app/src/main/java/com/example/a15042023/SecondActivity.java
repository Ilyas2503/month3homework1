package com.example.a15042023;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textView1 = findViewById(R.id.textView1);
        TextView textView2 = findViewById(R.id.textView2);
        TextView textView3 = findViewById(R.id.textView3);

        String value1 = getIntent().getStringExtra("value1");
        String value2 = getIntent().getStringExtra("value2");
        String value3 = getIntent().getStringExtra("value3");

        textView1.setText(value1);
        textView2.setText(value2);
        textView3.setText(value3);
    }
}

