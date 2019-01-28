package com.abstraction;

public class Test1Abs extends TestAbstraction {

    Test1Abs(int b){
        super(10, 30);
        System.out.println("b: "+ b);

    }
    void m1(){
        System.out.println("hello");
    }

    public static void main(String[] args) {
        TestAbstraction t = new Test1Abs(20);

        t.m1();

    }
}
