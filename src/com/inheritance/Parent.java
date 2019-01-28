package com.inheritance;

public class Parent {

    static {
        System.out.println("parent static block");
    }

    Parent(){
        System.out.println("Printing parent Cons");
    }
    Parent(String firstName){
        System.out.println("FirstName: " + firstName);
    }
}
