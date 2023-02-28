package com.semanticsquare.inheritance1;

public class Child extends Base{
    double weight;

    Child(){
        this.weight=-1;
    }

    Child(double l, double b, double w, double weight){
        super(l,b,w);//this will call the parent class constructor and is used to initialize the values present in the parent class
        this.weight=weight;
    }
}
