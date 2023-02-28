package com.semanticsquare.enums;

public class Basic {
    enum Week{
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
        //these are the enum constants
        //and every constant is public,static,final
        //type of all constant is week
        //since these constants are final so we can't create the child enum

        Week(){
            System.out.println("Constructor called for "+this);
        }
    }

    public static void main(String[] args) {
        Week week;
        week=Week.Monday;
//
//        System.out.println(week);
//
//        for(Week day:Week.values()){
//            System.out.println(day);
//        }
    }
}
