package com.com.polymorphism;

public class Parent1 {

    public ParentReturnType m1(){
        System.out.println("Parent method");
        return new ParentReturnType();
    }
    public class ParentReturnType{}
}
