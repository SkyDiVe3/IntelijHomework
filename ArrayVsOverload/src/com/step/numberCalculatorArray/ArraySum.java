package com.step.numberCalculatorArray;

public class ArraySum {
    public int Sum(int [] x){
       int result = 0;
        for (int i = 0 ; i <= x.length ; i++){
            result+=x[i];
        }
        return result;
    }
}
