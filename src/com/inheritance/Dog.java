package com.inheritance;

public class Dog extends Animal {
    int a = 20;

    public void m1() {

        System.out.println("Dog is eating");


    }

    public static void main(String[] args) {
        //Animal A = new Animal();

        Dog B = new Dog();

        //A.m1();
        B.m1();
        System.out.println(B.a);
    }
}
