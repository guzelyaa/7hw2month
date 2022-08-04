package com.example.a7hw2month;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Integer first, second;
    private Boolean isOperationClick;
    private String operation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text_view);
    }

    public void onNumberClick(View view) {
        switch (view.getId()) {
            case R.id.btn_0:
                if (!isOperationClick && !textView.getText().toString().equals("0")) {
                    textView.append("0");
                }
                break;

            case R.id.btn_1:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("1");
                } else if (isOperationClick) {
                    textView.setText("1");
                } else {
                    textView.append("1");
                }
                break;

            case R.id.btn_2:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("2");
                } else if (isOperationClick) {
                    textView.setText("2");
                } else {
                    textView.append("2");
                }
                break;


            case R.id.btn_3:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("3");
                } else if (isOperationClick) {
                    textView.setText("3");
                } else {
                    textView.append("3");
                }
                break;

            case R.id.btn_4:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("4");
                } else if (isOperationClick) {
                    textView.setText("4");
                } else {
                    textView.append("4");
                }
                break;

            case R.id.btn_5:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("5");
                } else if (isOperationClick) {
                    textView.setText("5");
                } else {
                    textView.append("5");
                }
                break;

            case R.id.btn_6:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("6");
                } else if (isOperationClick) {
                    textView.setText("6");
                } else {
                    textView.append("6");
                }
                break;

            case R.id.btn_7:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("7");
                } else if (isOperationClick) {
                    textView.setText("7");
                } else {
                    textView.append("7");
                }
                break;

            case R.id.btn_8:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("8");
                } else if (isOperationClick) {
                    textView.setText("8");
                } else {
                    textView.append("8");
                }
                break;

            case R.id.btn_9:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("9");
                } else if (isOperationClick) {
                    textView.setText("9");
                } else {
                    textView.append("9");
                }
                break;

            case R.id.btn_clear:
                textView.setText("0");
                first = 0;
                second = 0;
                break;
        }
        isOperationClick = false;
    }

    public void onOperationClick(View view) {
        switch (view.getId()) {
            case R.id.btn_plus:
                first = Integer.parseInt(textView.getText().toString());
                operation = "plus";
                break;

            case R.id.btn_minus:
                first = Integer.parseInt(textView.getText().toString());
                operation = "minus";
                break;

            case R.id.btn_multiply:
                first = Integer.parseInt(textView.getText().toString());
                operation = "multiply";
                break;

            case R.id.btn_divide:
                first = Integer.parseInt(textView.getText().toString());
                operation = "divide";
                break;

            case R.id.btn_equal:
                switch (operation) {
                    case "plus":
                        second = Integer.parseInt(textView.getText().toString());
                        Integer resultPlus = first + second;
                        textView.setText(resultPlus.toString());
                        break;

                    case "minus":
                        second = Integer.parseInt(textView.getText().toString());
                        Integer resultMinus = first - second;
                        textView.setText(resultMinus.toString());
                        break;

                    case "multiply":
                        second = Integer.parseInt(textView.getText().toString());
                        Integer resultMultiply = first * second;
                        textView.setText(resultMultiply.toString());
                        break;

                    case "divide":
                        second = Integer.parseInt(textView.getText().toString());
                        Integer resultDivide = first / second;
                        textView.setText(resultDivide.toString());
                        break;
                }

        }
        isOperationClick = true;
    }
}