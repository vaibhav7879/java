package com.semanticsquare.exception;

public class Exception2 {
    public static void main(String[] args){
        Exception2 t =new Exception2();
        try{
            t.divide();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        System.out.print("Hello");
    }

    private void divide() {
        int a=100,b=0,c;
        c=a/b;
        
    }
}
