package com.step.computer;

public class Computer {
    double x,y;

    public Computer(double x,double y){
        this.x=x;
        this.y=y;

    }
    public void Addition(){
        System.out.println("x+y="+(this.x+this.y));
    }
    public void Substraction(){
        System.out.println("x-y="+(this.x-this.y));
    }
    public void Multiplication(){
        System.out.println("x*y="+(this.x*this.y));
    }
    public void Division(){
        System.out.println("x/y="+(this.x/this.y));
    }

}
