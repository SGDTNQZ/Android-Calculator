package com.littlelemon.android_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView answer_tv, previous_tv; // Displays the inputting numbers
    Button button7, button8, button9,
            button4, button5, button6,
            button1, button2, button3,
            button0;

    Button clear_btn, negative_btn, plus_btn, minus_btn, multiply_btn, divide_btn, equal_btn; // C, +/-, +, -, X, /, =

    String operation, previousText;

    String firstNum, secondNum;


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
        previous_tv = findViewById(R.id.previous_txtv);

        clear_btn = findViewById(R.id.clear_btn); // C
        negative_btn = findViewById(R.id.negative_btn); // +/-
        plus_btn = findViewById(R.id.plus_btn); // +
        equal_btn = findViewById(R.id.equal_btn); // =
        minus_btn = findViewById(R.id.minus_btn); // -
        multiply_btn = findViewById(R.id.multiply_btn); // X
        divide_btn = findViewById(R.id.divide_btn); // /

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


        View.OnClickListener operation_btn = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstNum = answer_tv.getText().toString();

                if(view.getId() == R.id.plus_btn){
                    operation = "+";
                } else if (view.getId() == R.id.minus_btn) {
                    operation = "-";
                } else if (view.getId() == R.id.multiply_btn) {
                    operation = "*";
                } else if (view.getId() == R.id.divide_btn) {
                    operation = "/";
                }

                previousText = firstNum + operation;
                previous_tv.setText(previousText);

                answer_tv.setText("0");
            }
        };
        plus_btn.setOnClickListener(operation_btn);
        minus_btn.setOnClickListener(operation_btn);
        multiply_btn.setOnClickListener(operation_btn);
        divide_btn.setOnClickListener(operation_btn);


        equal_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                secondNum = answer_tv.getText().toString();
                int num1 = Integer.parseInt(firstNum);
                int num2 = Integer.parseInt(secondNum);
                int answer = 0;

                if(operation.equals("+")){
                    answer = num1 + num2;
                } else if (operation.equals("-")) {
                    answer = num1 - num2;
                }else if (operation.equals("*")) {
                    answer = num1 * num2;
                }else if (operation.equals("/")) {
                    answer = num1 / num2;
                }

                previousText = firstNum + operation + secondNum + "=" + answer;

                previous_tv.setText(previousText);
                answer_tv.setText("" + answer);
            }
        });
    }
}