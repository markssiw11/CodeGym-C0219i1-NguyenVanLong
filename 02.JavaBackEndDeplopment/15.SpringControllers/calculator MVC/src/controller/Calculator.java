package controller;

import java.io.IOException;

public class Calculator {
    public static float calculate(float firstOperand,float secondOperand,String operator) {
        switch (operator) {
            case "Addition":
                return firstOperand+secondOperand;
            case "Subtraction":
                return firstOperand-secondOperand;
            case "Multiplication":
                return firstOperand*secondOperand;
            case "Division":
                if(secondOperand!=0) {

                    return firstOperand / secondOperand;
                } else {
                    throw new RuntimeException("can't division by zero");
                }
                default:
                    throw new  RuntimeException("Invalid Operator");
        }
    }
}
