package com.semanticsquare.abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(20);
        son.carrier();

        Daughter daughter = new Daughter(25);
        daughter.carrier();

        son.normal();
        daughter.normal();
    }
}
