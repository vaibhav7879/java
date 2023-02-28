package com.semanticsquare.staticExample;

public class StaticExample {
    int age;
    String name;
    int salary;
    static long population;
    StaticExample(int age, String name, int salary){
        this.age=age;
        this.name=name;
        this.salary=salary;

        population+=1;
    }
}
