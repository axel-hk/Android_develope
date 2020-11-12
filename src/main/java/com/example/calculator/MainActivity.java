package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button buttonAdd, buttonSubstract, buttonDivide,
                    buttonMultiply, buttonClear, buttonPow;
    private TextView operation, result;
    private EditText firstNum, secondNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonAdd = (Button) findViewById(R.id.buttonAdd);
        buttonSubstract = (Button) findViewById(R.id.buttonSubstract);
        buttonDivide = (Button) findViewById(R.id.buttonDivide);
        buttonMultiply = (Button) findViewById(R.id.buttonMultiply);
        buttonClear = (Button) findViewById(R.id.buttonClean);
        buttonPow = (Button) findViewById(R.id.buttonPow);
        operation = (TextView) findViewById(R.id.operation);
        result = (TextView) findViewById(R.id.result);
        firstNum = (EditText) findViewById(R.id.firstNum);
        secondNum = (EditText) findViewById(R.id.secondNum);
        buttonAdd.setOnClickListener(this);
        buttonSubstract.setOnClickListener(this);
        buttonDivide.setOnClickListener(this);
        buttonMultiply.setOnClickListener(this);
        buttonClear.setOnClickListener(this);
        buttonPow.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        float fNum = 0;
        float sNum = 0;
        float res = 0;
        fNum = Float.parseFloat(firstNum.getText().toString());
        sNum = Float.parseFloat(secondNum.getText().toString());
        switch (v.getId()) {
            case R.id.buttonAdd:
                operation.setText("+");
                res = fNum + sNum;
                break;
            case R.id.buttonClean:
                firstNum.setText("");
                operation.setText("");
                secondNum.setText("");
                result.setText("");
            case R.id.buttonSubstract:
                operation.setText("-");
                res = fNum - sNum;
                break;
            case R.id.buttonMultiply:
                operation.setText("*");
                res = fNum * sNum;
                break;
            case R.id.buttonDivide:
                operation.setText("/");
                res = fNum / sNum;
                break;
            case R.id.buttonPow:
                operation.setText("^");
                res = (float) Math.pow(fNum, sNum);
                break;
            default:
                break;
        }

        result.setText(res+"");

    }
}