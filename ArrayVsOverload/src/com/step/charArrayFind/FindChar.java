package com.step.charArrayFind;

public class FindChar {
    public void VowelConsonant(char [] x){
        for (int i = 0;i <= x.length;i++){

            switch (x[i]){
                case 'a': System.out.println("Position." + i + "=Vowel(" + x[i] +")");break;
                case 'e': System.out.println("Position." + i + "=Vowel(" + x[i] +")");break;
                case 'o': System.out.println("Position." + i + "=Vowel(" + x[i] +")");break;
                case 'i': System.out.println("Position." + i + "=Vowel(" + x[i] +")");break;
                case 'y': System.out.println("Position." + i + "=Vowel(" + x[i] +")");break;
                default:System.out.println("Position." + i + "=Consonant(" + x[i] +")");break;
            }

        }
    }
}
