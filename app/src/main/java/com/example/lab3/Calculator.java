
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
    private boolean multipleOperations = false;
    private int numOperands = 0;

    public Calculator(AppCompatActivity parent){
        this.parent = parent;
        inputBuffer = new StringBuilder();
        displayBuffer = new StringBuilder();
        answer = new BigDecimal(0);

    }

    public void process(String button){
        if(button.equals(parent.getResources().getString(R.string.btnClear))){

        }

        else if(button.equals(parent.getResources().getString(R.string.btnSign))){

        }

        else if(button.equals(parent.getResources().getString(R.string.btnDecimal))){
            inputBuffer.append(button);
            displayBuffer.append(button);
        }

        else if(button.equals(parent.getResources().getString(R.string.btnSquareRoot))){

        }

        else if(button.equals(parent.getResources().getString(R.string.btnDivide))){
            inputBuffer.append(button);
            displayBuffer.append(button);
        }

        else if(button.equals(parent.getResources().getString(R.string.btnPercent))){
            inputBuffer.append(button);
            displayBuffer.append(button);
        }

        else if(button.equals(parent.getResources().getString(R.string.btnMultiply))){
            inputBuffer.append(button);
            displayBuffer.append(button);
        }

        else if(button.equals(parent.getResources().getString(R.string.btnMinus))){
            inputBuffer.append(button);
            displayBuffer.append(button);
        }

        else if(button.equals(parent.getResources().getString(R.string.btnPlus))){
            inputBuffer.append(button);
            displayBuffer.append(button);
            ++numOperands;

            if (numOperands > 1) {

                String[] operands = inputBuffer.toString().split(button);
                lValue = new BigDecimal(operands[0]);
                rValue = new BigDecimal(operands[1]);


                answer = lValue.add(rValue);

                lValue = answer;


                displayBuffer = new StringBuilder(answer.toString());
                inputBuffer = new StringBuilder(answer.toString());
                numOperands = 1;
            }


        }

        else if(button.equals(parent.getResources().getString(R.string.btnEquals))){
        }

        else if(button.equals(parent.getResources().getString(R.string._0))){
            inputBuffer.append(button);
            displayBuffer.append(button);
        }

        else if(button.equals(parent.getResources().getString(R.string._1))){
            inputBuffer.append(button);
            displayBuffer.append(button);
        }

        else if(button.equals(parent.getResources().getString(R.string._2))){
            inputBuffer.append(button);
            displayBuffer.append(button);
        }

        else if(button.equals(parent.getResources().getString(R.string._3))){
            inputBuffer.append(button);
            displayBuffer.append(button);
        }

        else if(button.equals(parent.getResources().getString(R.string._4))){
            inputBuffer.append(button);
            displayBuffer.append(button);
        }

        else if(button.equals(parent.getResources().getString(R.string._5))){
            inputBuffer.append(button);
            displayBuffer.append(button);
        }

        else if(button.equals(parent.getResources().getString(R.string._6))){
            inputBuffer.append(button);
            displayBuffer.append(button);
        }

        else if(button.equals(parent.getResources().getString(R.string._7))){
            inputBuffer.append(button);
            displayBuffer.append(button);
        }

        else if(button.equals(parent.getResources().getString(R.string._8))){
            inputBuffer.append(button);
            displayBuffer.append(button);
        }

        else if(button.equals(parent.getResources().getString(R.string._9))){
            inputBuffer.append(button);
            displayBuffer.append(button);
        }
    }

    public String getDisplay(){
        return displayBuffer.toString();
    }
}
