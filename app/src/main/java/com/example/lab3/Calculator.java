
package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;
import java.math.BigDecimal;

public class Calculator {

    private AppCompatActivity parent;
    private BigDecimal lValue;
    private BigDecimal rValue;
    private StringBuilder inputBuffer;
    private StringBuilder displayBuffer;
    private boolean multipleOperands = false;

    public Calculator(AppCompatActivity parent){
        this.parent = parent;
        inputBuffer = new StringBuilder();
        displayBuffer = new StringBuilder();
        lValue = new BigDecimal(0);
        rValue = new BigDecimal(0);

    }

    public void process(String button){
        if(button.equals(parent.getResources().getString(R.string.)))
    }

    public String getDisplay(){
        return "";
    }
}
