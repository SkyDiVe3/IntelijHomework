package com.step.maxminArray;

public class ArrayMaxMin {
    public int Max(int [] x){
        int max = 0;
        for (int i = 0;i <= x.length; i++){
            if (max < x[i]) max = x [i];
            else continue;
        }
        return max;
    }
    public int Min(int [] x){
        int min = 0;
        for (int i = 0;i <= x.length; i++){
            if (min > x[i]) min = x [i];
            else continue;
        }
        return min;
    }
}
