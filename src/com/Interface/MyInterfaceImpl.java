package com.Interface;

public class MyInterfaceImpl implements MyInterface {


    public void m1() {
        System.out.println("implementing Interface Class--- " + MyInterface.name);
    }



    public static void main(String[] args) {

        MyInterface t = new MyInterfaceImpl();
        t.m1();

    }
}
