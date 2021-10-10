package com.example.calculator;

import java.text.DecimalFormat;

public class Calculator {

    final String CLEAR_INPUT_TEXT = "0";
    double resultNumber = 0;
    double lastInputNumber = 0;
    String operator = "+";

    DecimalFormat decimalFormat = new DecimalFormat("###,###.#####");

    public String getDecimalString(String changeString) {
        String setChageString = changeString.replace(",", "");
        return decimalFormat.format(Double.parseDouble(setChageString));
    }

    public String getDecimalString(double changeNumber) {
        return decimalFormat.format(changeNumber);
    }

    public String getclearInputText() {
        return CLEAR_INPUT_TEXT;
    }

    public void setAllClear() {
         resultNumber = 0;
         lastInputNumber = 0;
         operator = "+";
    }

    public double doubleCalculator(double result,double lastNumber, String operator) {
        switch(operator) {
            case "+":
                result += lastNumber;
                break;
            case "-":
                result -= lastNumber;
                break;
            case "*":
                result *= lastNumber;
                break;
            case "/":
                result /= lastNumber;
                break;
        }
        return result;
    }

    public String getResult(boolean isFirstInput, String getResultString, String lastOperator) {
        if(isFirstInput) {
            if(lastOperator.equals("=")) {
                resultNumber = doubleCalculator(resultNumber, lastInputNumber, operator);
            }else {
                operator = lastOperator;
            }

        }else {
            lastInputNumber = Double.parseDouble(getResultString.replace(",", ""));
            resultNumber = doubleCalculator(resultNumber, lastInputNumber, operator);
            if(!lastOperator.equals("=")) {
                operator = lastOperator;
            }
        }
        return getDecimalString(resultNumber);
    }
}
