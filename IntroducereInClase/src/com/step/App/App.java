package com.step.App;

import com.step.converter.TempConverter;
import com.step.computer.Computer;
import com.step.comparator.NumbersComparator;
import java.util.*;
public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x,y;
        //Afisarea sarcinii #1/2
            TempConverter temperatura = new TempConverter();
            temperatura.convertToCelsius();
            temperatura.convertToFahr();
        //Afisarea sarcinii #3
            System.out.println("Adaugati 2 numere intregi:");
            Computer calculator = new Computer(sc.nextInt(), sc.nextInt());
            calculator.Addition();
            calculator.Division();
            calculator.Multiplication();
            calculator.Substraction();
        //Afisarea sarcinii #4
            System.out.println("Introduceti doua numere zecimale:");
            x= sc.nextDouble();
            y= sc.nextDouble();
            NumbersComparator comparate = new NumbersComparator();
            System.out.println("Numarul mai mare ="+(comparate.Max(x,y)));
            System.out.println("Numarul mai mic ="+(comparate.Min(x,y)));


    }
}
