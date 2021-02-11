package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Calculator calculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calculator = new Calculator(this);
    }

    public void onClick(View v){
        String button = ((Button) v).getText().toString();
        calculator.process(button);
        TextView output = (TextView)findViewById(R.id.output);
        output.setText(calculator.getDisplay());
    }
}