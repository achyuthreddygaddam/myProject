package com.test;

public class Teacher {

    int id;
    String name;

    Teacher(int id, String name) {
        this.id = id;
        this.name = name;
    }


    void display() {

        System.out.println("Below are the student details");
        System.out.println(id + " " + name);
    }
}
