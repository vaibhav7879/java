package com.semanticsquare.lambda;



public class main {
    public static void main(String[] args) {

        //this method can only be used for functional interface and if there will be more than 2 methods than we have to use anonymous class
        MyInter i = () -> System.out.println("using lambda");
        i.sayHello();

        MyInter i2 = () -> System.out.println("using lambda");
        i2.sayHello();

        sumInter i3 = (a,b) -> a+b;
        System.out.println(i3.findSum(5,5));


    }
}
