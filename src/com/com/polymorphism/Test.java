package com.com.polymorphism;

//Method Overloading concept in Polymorphism

public class Test {

    int b = 30;

    Test(){
        System.out.println("No args Cons");
    }

    Test(int a){
        System.out.println(a);
    }

    Test(String sex){
        System.out.println("Sex: " + sex);
    }

    public void m1(int a){
        System.out.println(a);
    }

    public void m1(int c, String name){
        System.out.println("C : " + c + "\n" + "name : " + name);
    }

    public static void main(String[] args) {

        Test t1 = new Test();
        Test t = new Test(20);
        Test t3 = new Test("Male");
        t.m1(10);
        t.m1(40, "Achyuth");

        System.out.println(t.b);
    }
}
