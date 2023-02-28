package com.semanticsquare.exception;

public class Finally {
    public static void main(String[] args){

        try{
            int a=100,b=0,c;
            c=a/b;
            System.out.println(c);
        }catch (Exception e){
//            System.out.println(e);
//            System.out.println("Cannot divide by zero");
            e.printStackTrace();
        }
        finally { // finally block will be executed whether the catch block is executed or not.
            System.out.println("I am in finally block");
        }
    }
}
