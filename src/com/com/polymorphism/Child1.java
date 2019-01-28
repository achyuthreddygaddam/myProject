package com.com.polymorphism;

public class Child1 extends Parent1 {

    public ChildReturnType m1() {
        System.out.println("Child method");
        return new ChildReturnType();
    }

    public class ChildReturnType extends ParentReturnType {
    }

    public static void main(String[] args) {
        Child1 Ch = new Child1();

        Ch.m1();

    }
}
