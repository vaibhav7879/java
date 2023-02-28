package com.semanticsquare.staticExample;

public class Main {
    public static void main(String[] args) {
        StaticExample A = new StaticExample(10,"A",15000);
        StaticExample B = new StaticExample(15,"B",10000);

        System.out.println(StaticExample.population);
        System.out.println(StaticExample.population);

    }
}
