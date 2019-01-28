package com.inheritance;

public class Child extends Parent{

    static {
        System.out.println("child static block");
    }

    Child(){

        System.out.println("Printing child Cons");
    }

    Child(String middleName){
        super("achyuth");
        System.out.println("MiddleName: " + middleName);
    }

    public static void main(String[] args) {
        Child C = new Child();
        Child C1 = new Child("reddy");
    }
}
