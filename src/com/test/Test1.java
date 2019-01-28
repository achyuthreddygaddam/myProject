package com.test;

public class Test1 extends Test {

    public static void matches(int katnam, String bride) {


        System.out.println(katnam + " " + bride);
    }

    public static void main(String[] args) {
        Test t = new Test1();
        Test.matches(2000, "dnt give");

        System.out.println("Emp id: " + t.id);
        System.out.println("Name: " + t.name);
        System.out.println("Salary: " + t.salary);
        System.out.println("Info: " + t.answer);
    }
}
