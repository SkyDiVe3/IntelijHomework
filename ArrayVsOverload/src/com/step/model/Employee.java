package com.step.model;

public class Employee {
    String name, surname, birthdate;
    public Employee(){
        this.name="user";
        this.surname="user";
    }
    public Employee(String name, String surname){
        this.name=name;
        this.surname=surname;
    }
    public Employee(String name, String surname, String birthdate){
        this.name=name;
        this.surname=surname;
        this.birthdate=birthdate;
    }

}
