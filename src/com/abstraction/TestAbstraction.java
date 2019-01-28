package com.abstraction;

public abstract class TestAbstraction {
    static{
        System.out.println("hi");
    }
    {
        System.out.println("hello");
    }

    int k;

    TestAbstraction(int a, int j){
this.k =j;
        System.out.println("a: "+ a + "\n"+"k: "+ k);
    }

    //abstract method ends with ";"
    abstract void m1();

    public static void main(String[] args) {
        System.out.println("hi hw r uu");
    }


}
