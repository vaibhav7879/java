package com.semanticsquare.generics1;

import java.util.Arrays;
import java.util.List;

public class Wildcard<T extends Number> {
    private Object[] data;
    private static int DEFAULT_SIZE=10;
    private int size=0;

    public Wildcard(){
        this.data= new Object[DEFAULT_SIZE];
    }

    public void getList(List<? extends Number> list){

    }

    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++]=num;
    }

    private boolean isFull() {
        return size== data.length;
    }

    private void resize(){
        Object[] temp=new Object[data.length*2];
        for(int i=0;i<data.length;i++){
            temp[i]=data[i];
        }
        data=temp;
    }

    public T remove(){
        T removed=(T)data[--size];
        return removed;
    }

    public T get(int index){
        return (T)data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, int value){
        data[index]=value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        Wildcard<Integer> list = new Wildcard();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);


        // now we have only extended this to number so we can't use String because string is not included in the Number
        //Here we can either add Number or the subclasses of number
//        Wildcard<String> list1 = new Wildcard();
//        list1.add("a");
//        list1.add("b");
//        list1.add("c");
//
//        System.out.println(list1);
    }

}
