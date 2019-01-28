package com.com.polymorphism;


public class Child extends Parent {

    void marry() {
        System.out.println("Red Girl");

    }

    void pelli() {
        System.out.println("naku pelli odhu");
    }

    public static void main(String[] args) {
        Parent p = new Child();
        p.marry();
        Child C = (Child)p;
        C.pelli();
    }
}
