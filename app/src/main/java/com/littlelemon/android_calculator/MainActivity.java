package com.littlelemon.android_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView answer_tv;
    Button button7, button8, button9, button4, button5, button6, button1, button2, button3, button0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        answer_tv = findViewById(R.id.answer_txtv);

        button7 = findViewById(R.id.num7_btn);
        button8 = findViewById(R.id.num8_btn);
        button9 = findViewById(R.id.num9_btn);
        button4 = findViewById(R.id.num4_btn);
        button5 = findViewById(R.id.num5_btn);
        button6 = findViewById(R.id.num6_btn);
        button1 = findViewById(R.id.num1_btn);
        button2 = findViewById(R.id.num2_btn);
        button3 = findViewById(R.id.num3_btn);
        button0 = findViewById(R.id.num0_btn);

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer_tv.setText("7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer_tv.setText("8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer_tv.setText("9");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer_tv.setText("4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer_tv.setText("5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer_tv.setText("6");
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer_tv.setText("1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer_tv.setText("2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer_tv.setText("3");
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer_tv.setText("0");
            }
        });
    }
}