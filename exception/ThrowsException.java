package com.semanticsquare.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

class ReadFile{
    void read() throws FileNotFoundException {
    FileInputStream fs = new FileInputStream("d:/abc.txt");

    }
}
public class ThrowsException {
    public static void main(String[] args){
        ReadFile r = new ReadFile();
        try {
            r.read();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Hello");
    }
}
