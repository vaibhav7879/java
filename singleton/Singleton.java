package com.semanticsquare.singleton;

public class Singleton {

    int x=1;

    //here we have made the private constructor so that from outside no one can create its instance
    private Singleton(){

    }

    //here we have made one instance
    static Singleton instance;

    //here we have returned the created instance
    public static Singleton getInstance(){
        if(instance==null)
        {
            instance = new Singleton();
        }
        return instance;
    }
}
