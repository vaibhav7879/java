package com.semanticsquare.exception;

import java.io.FileInputStream;

public class Exception1 {
    public static void main(String[] args){

//        FileInputStream fis = new FileInputStream("d:/abc.txt");  //In this compiler finds that this can throw the exception in future, so this is the checked exception.

//        int a=100,b=0,c;
//        c=a/b; // this exception is runtime exception which compiler can't check at compilation, but it throws at the runtime.
//        System.out.println(c);
        // Now handling the above code using try and catch
        try{
            int a=100,b=0,c;
            c=a/b;
            System.out.println(c);
        }catch (Exception e){
//            System.out.println(e);
//            System.out.println("Cannot divide by zero");
            e.printStackTrace();
        }


    }
}
