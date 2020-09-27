package com.step.reverseArray;

public class ReverseArray {
    public int [] Reverse (int [] x){
        int [] reversed=new int[20];
        for (int i = x.length;i >= 0;i--){
            reversed[(x.length-i)]=x[i];
        }
        return reversed;
    }
}
