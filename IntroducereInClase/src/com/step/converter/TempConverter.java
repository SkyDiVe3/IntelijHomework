package com.step.converter;
import java.util.Scanner;
public class TempConverter {

    public double Celsius,Fahr;
    Scanner scanner=new Scanner(System.in);
    public TempConverter(){
        System.out.println("Introduceti 2 numere zecimale");
        System.out.println("Celsius=" +(this.Celsius = scanner.nextDouble())+"°C");
        System.out.println("Fahr="    +(this.Fahr    = scanner.nextDouble())+"°C");
    }

    public void convertToFahr(){
        double Fahr;
        Fahr=((Celsius * 9/5) + 32);
        System.out.println(Celsius + "°C->" + Fahr + "°F");
    }
    public void convertToCelsius(){
        double Celsius;
        Celsius=((Fahr - 32) * 5/9);
        System.out.println(Fahr + "°F->" + Celsius + "°C");
    }
}
