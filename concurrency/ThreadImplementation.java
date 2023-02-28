package com.semanticsquare.concurrency;

public class ThreadImplementation {
    public static void main(String[] args)  {
        Task task =new Task();
        Thread thread=new Thread(task);

        thread.start();

        try {
            Thread.sleep(3000);// here we are saying that main thread have to stop its execution for 3sec.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Inside main.. ..");
    }
}
class Task implements Runnable{

    @Override
    public void run() {
        System.out.println("Inside run....");
        go();
    }

    private void go(){
        System.out.println("Inside go....");
        more();
    }

    private void more(){
        System.out.println("Inside more....");
    }
}
