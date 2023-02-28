package com.semanticsquare.inheritance1;

public class Main {
    public static void main(String[] args) {
        Base box1 = new Base();
        Base box2 = new Base(1,1,1);

        System.out.println(box1.l+" "+ box1.b+" "+box1.w);
        System.out.println(box2.l+" "+ box2.b+" "+box2.w);

        Child child1 = new Child();
        System.out.println(child1.l+" "+ child1.b+" "+ child1.w);

        Child child2 = new Child(5,5,5,5);
        System.out.println(child2.l+" "+ child2.b+" "+ child2.w);

        Base A = new Child(1,2,3,4);
        //here "Base" is the reference variable whereas "Child" is the object type and we can access the member of the reference variable rather then the members of the object type
        System.out.println(A.b);
    }
}
