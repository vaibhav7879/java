package com.semanticsquare.exception;

import java.util.Scanner;

class UserDefinedException extends RuntimeException{
    UserDefinedException(String msg){
        super(msg);
    }
}
public class ThrowException {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the age: " );

        int age=s.nextInt();
        try{
            if(age<18){
                throw new UserDefinedException("you are not eligible");
                //in throw keyword user makes the exception object which is then processed to JVM
            }
            else{
                System.out.println("You have successfully voted");
            }
        }
        catch (UserDefinedException e){
            e.printStackTrace();
        }
    }
}
