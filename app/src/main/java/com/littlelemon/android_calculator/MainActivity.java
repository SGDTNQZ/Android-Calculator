package com.littlelemon.android_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView answer_tv;
    Button button7, button8, button9,
            button4, button5, button6,
            button1, button2, button3,
            button0;

    Button clear_btn,negative_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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

        answer_tv = findViewById(R.id.answer_txtv);

        clear_btn = findViewById(R.id.clear_btn);
        negative_btn = findViewById(R.id.negative_btn);

        View.OnClickListener buttonNumbers = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String addNumber = answer_tv.getText().toString();
                String resultNumber = "";

                if (view.getId() == R.id.num0_btn) {
                    resultNumber = "0";
                } else if (view.getId() == R.id.num1_btn) {
                    resultNumber = "1";
                } else if (view.getId() == R.id.num2_btn) {
                    resultNumber = "2";
                } else if (view.getId() == R.id.num3_btn) {
                    resultNumber = "3";
                } else if (view.getId() == R.id.num4_btn) {
                    resultNumber = "4";
                } else if (view.getId() == R.id.num5_btn) {
                    resultNumber = "5";
                } else if (view.getId() == R.id.num6_btn) {
                    resultNumber = "6";
                } else if (view.getId() == R.id.num7_btn) {
                    resultNumber = "7";
                } else if (view.getId() == R.id.num8_btn) {
                    resultNumber = "8";
                } else if (view.getId() == R.id.num9_btn) {
                    resultNumber = "9";
                }

                if (!addNumber.equals("0")) {
                    resultNumber = addNumber + resultNumber;
                }

                answer_tv.setText(resultNumber);
            }
        };

        button7.setOnClickListener(buttonNumbers);
        button8.setOnClickListener(buttonNumbers);
        button9.setOnClickListener(buttonNumbers);
        button4.setOnClickListener(buttonNumbers);
        button5.setOnClickListener(buttonNumbers);
        button6.setOnClickListener(buttonNumbers);
        button1.setOnClickListener(buttonNumbers);
        button2.setOnClickListener(buttonNumbers);
        button3.setOnClickListener(buttonNumbers);
        button0.setOnClickListener(buttonNumbers);

        View.OnClickListener clear_txtv = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer_tv.setText("0");
            }
        };

        clear_btn.setOnClickListener(clear_txtv);

        View.OnClickListener setNumNegative = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String result_txt = answer_tv.getText().toString();
                int result = Integer.parseInt(result_txt);

                if(result>0){
                    answer_tv.setText("-" + result_txt);
                }
                else{
                    result = result * (-1);
                    answer_tv.setText(""+result);
                }
            }
        };

        negative_btn.setOnClickListener(setNumNegative);
    }
}