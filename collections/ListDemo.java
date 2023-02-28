package com.semanticsquare.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

    private static List arrayListDemo() {
        List<Integer> list1 = new ArrayList<>();
        //adding elements to the list
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(3);
        //arrayList can store null values as well
        list1.add(null);
        System.out.println("list1: " + list1);

        //removing element at the third position
        list1.remove(3);
        System.out.println("list1: " + list1);

        //again removing element at the third position
        list1.remove(3);
        System.out.println("list1: " + list1);

        //adding 10 to position 0, so all elements will shift to right
        list1.add(0, 10);
        System.out.println("list1: " + list1);

        //setting 0 position element to 9
        list1.set(0, 9);
        System.out.println("list1: " + list1);

        // Bulk Operations
        //here we are creating a new collection and adding the elements in it
        Collection<Integer> list2 = new ArrayList<>();
        list2.add(9);
        list2.add(3);

        //removing the elements of list2 from list1
        list1.removeAll(list2);
        System.out.println("list1: " + list1);

        list2.add(1);

        //retainAll() will retain the same elements of list1 and list2 in list1 and will remove all the other elements
        list1.retainAll(list2);
        System.out.println("list1: " + list1);

        //addAll() will add all the elements of list2 to list1.
        list1.addAll(list2);
        System.out.println("list1: " + list1);

        //this statement will set the element at index 2 to 2 and print the previous element
        System.out.println("list1.set(2, 2): " + list1.set(2, 2));


        // Search
        //Contains() check whether the element is present or not
        System.out.println("list1.contains(1): " + list1.contains(1));
        //indexOf() provides the index of first occurence of 1
        System.out.println("list1.indexOf(1): " + list1.indexOf(1));
        //lastIndexOf() provides the index of last occurence of 1
        System.out.println("list1.lastIndexOf(1): " + list1.lastIndexOf(1));

        //printing list1
        System.out.println("list1: " + list1);


        // Range-view: subList (new list is backed by original)
        //making the new list by using the subList and any changes in the new list will also be reflected in the old list as well
        List<Integer> list3 = list1.subList(2, 3);
        list3.set(0, 6);
        System.out.println("list1: " + list1);
        list3.add(0, 7);
        System.out.println("list1: " + list1);
        //changes in list1 are also reflected in list3
        list1.set(2, 8);
        System.out.println("list3: " + list3);
        //list1.add(0, 8); // we cannot make the structural changes in list1, if we will make than this will show an error
        //System.out.println("list3: " + list3);
        System.out.println("list1: " + list1);

//        for (int element : list1) {
//            System.out.println("element: " + element);
//
//            // Generates ConcurrentModificationException
        // // without the iterator we cannot remove the elements as this will show an error
//            if (element == 9) {
//                list1.remove(Integer.valueOf(element)); // valueOf is used due to its caching
//            }
//        }

        return list1;
    }

    public static void main(String[] args) {
        List<Integer> list1 = arrayListDemo();
        iteratorDemo(list1);
    }

    private static  void iteratorDemo(List<Integer> list1) {
        System.out.println("\nInside iteratorDemo ... ");

        //invoking the iterator
        Iterator<Integer> iterator = list1.iterator();
        while (((Iterator<?>) iterator).hasNext()) {
            int element = iterator.next();
            System.out.println("element: " + element);

            if (element == 9) {
                iterator.remove();
//                iterator.forEachRemaining(Filter::add);
            }
        }
        System.out.println("list1: " + list1);

//        list1.forEach(System.out::println);
        //list1.forEach(Filter::filter);
        //list1.forEach(new Filter());	// requires implementing Consumer

        // forEachRemaining:
        // http://mail.openjdk.java.net/pipermail/lambda-dev/2013-June/010221.html
        // A/C Brian Goetz, he doesn't see much use of this method
    }
}