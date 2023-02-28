package com.semanticsquare.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue1 {
     public static void main(String[] args){

         //by default this will execute the min heap
         Queue<Integer> q=new PriorityQueue<>();

         q.offer(40);
         q.offer(10);
         q.offer(20);

         System.out.println(q);

         q.poll();

         System.out.println(q);

         System.out.println(q.peek());
     }
}
