package com.company;

public class ConstructorClass {
    int id;
    String name;
    ConstructorClass(int i, String s){

        id = i;
        name = s;

        System.out.println(i + " " + s);
    }

    void display(){

        System.out.println("Calling with constructor");
    }

    public static void main(String[] args) {
        ConstructorClass C = new ConstructorClass(10, "abc");
        C.display();
        }
    }


