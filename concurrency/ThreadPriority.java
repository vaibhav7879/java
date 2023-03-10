package com.semanticsquare.concurrency;

public class ThreadPriority {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread());

        Thread t1 = new Thread(new EmailCampaign());
        Thread t2 = new Thread(new DataAggregator());

        //setting the name of threads
        t1.setName("EmailCampaign");
        t2.setName("DataAggregator");

        t1.setPriority(Thread.MAX_PRIORITY);//setting max priority for t1
        t2.setPriority(Thread.MIN_PRIORITY);//setting min priority for t2

        t1.start();
        t2.start();

        try {
            // main thread is suspended until t2 DIES
            t2.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Inside main ... ");
    }
}

class EmailCampaign implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName());
            if (i == 5) {
                // Hint to scheduler that thread is willing to
                // yield its current use of CPU
                Thread.currentThread().yield();
            }
        }
    }
}

class DataAggregator implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
