package com.semanticsquare.collections;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueue {

    public static void main(String[] args){
        Queue<Integer> q=new LinkedList<>();

        //offer() is used to insert the element
        q.offer(1);
        q.offer(2);
        q.offer(3);

        System.out.println(q);

        //poll() tells about the front element which is poped
        System.out.println(q.poll());

        System.out.println(q);

        //peek() tells about the next element which will be poped
        System.out.println(q.peek());
    }
}
