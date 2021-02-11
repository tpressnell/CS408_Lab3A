
package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;
import java.math.BigDecimal;

public class Calculator {

    private AppCompatActivity parent;
    private BigDecimal lValue;
    private BigDecimal rValue;
    private BigDecimal answer;
    private StringBuilder inputBuffer;
    private StringBuilder displayBuffer;
    private boolean multipleOperands = false;
    private boolean emptyValues = true;

    public Calculator(AppCompatActivity parent){
        this.parent = parent;
        inputBuffer = new StringBuilder();
        displayBuffer = new StringBuilder();
        lValue = new BigDecimal(0);
        rValue = new BigDecimal(0);
        answer = new BigDecimal(0);

    }

    public void process(String button){
        if(button.equals(parent.getResources().getString(R.string.btnClear))){

        }

        else if(button.equals(parent.getResources().getString(R.string.btnSign))){

        }

        else if(button.equals(parent.getResources().getString(R.string.btnDecimal))){

        }

        else if(button.equals(parent.getResources().getString(R.string.btnSquareRoot))){

        }

        else if(button.equals(parent.getResources().getString(R.string.btnDivide))){

        }

        else if(button.equals(parent.getResources().getString(R.string.btnPercent))){

        }

        else if(button.equals(parent.getResources().getString(R.string.btnMultiply))){

        }

        else if(button.equals(parent.getResources().getString(R.string.btnMinus))){

        }

        else if(button.equals(parent.getResources().getString(R.string.btnPlus))){

        }

        else if(button.equals(parent.getResources().getString(R.string.btnEquals))){

        }
    }

    public String getDisplay(){
        return "";
    }
}
