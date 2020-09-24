package com.step.comparator;

public class NumbersComparator {

    public double Max(double x, double y){
        double result;
        result = x > y ? x : y ;
        return result;
    }
    public double Min(double x, double y){
        double result;
        result = x < y ? x : y ;
        return result;
    }
}
