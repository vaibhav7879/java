package com.semanticsquare.collections;

import java.util.ArrayDeque;

public class ArrayDeque1 {

    public static void main(String[] args) {
        ArrayDeque<Integer> adq=new ArrayDeque<>();

        //offer() add the element at the last
        adq.offer(25);

        //offerFirst() add the element in front
        adq.offerFirst(12);

        //offerLast add the element at last
        adq.offerLast(45);
        System.out.println(adq);

        adq.pollFirst();
        System.out.println(adq);

        adq.pollLast();
        System.out.println(adq);
    }
}
