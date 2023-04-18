package com.example.a15042023;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.a15042023.R;

public class MainActivity extends AppCompatActivity {

    EditText editText1;
    EditText editText2;
    EditText editText3;
    AppCompatButton btn_click;
    String value1 = "";
    String value2 = "";
    String value3 = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        onClick();
//        btn_click.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                    }
//        });
    }

    private void onClick() {
        btn_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!editText1.getText().toString().isEmpty()) {
                    value1 = editText1.getText().toString();
                } else {
                    Toast.makeText(MainActivity.this, "Введите 1 имя!",
                            Toast.LENGTH_SHORT).show();
                    return;
                }

                if (!editText2.getText().toString().isEmpty()) {
                    value2 = editText2.getText().toString();
                } else {
                    Toast.makeText(MainActivity.this, "Введите 2 имя!",
                            Toast.LENGTH_SHORT).show();
                    return;
                }

                if (!editText3.getText().toString().isEmpty()) {
                    value3 = editText3.getText().toString();
                } else {
                    Toast.makeText(MainActivity.this, "Введите 3 имя!",
                            Toast.LENGTH_SHORT).show();
                    return;
                }
                navigateToSecondScreen();


            }
        });
    }

    private void findViews() {
        btn_click = findViewById(R.id.btnClick);
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        editText3 = findViewById(R.id.editText3);
    }
    public void navigateToSecondScreen() {
        Intent intent = new Intent(
                MainActivity.this, SecondActivity.class);
        intent.putExtra("value1", value1);
        intent.putExtra("value2", value2);
        intent.putExtra("value3", value3);
        startActivity(intent);
    }
}


