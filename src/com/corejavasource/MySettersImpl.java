package com.corejavasource;

public class MySettersImpl extends MySetters{

    public static void main(String[] args) {
        MySettersImpl m = new MySettersImpl();
        m.setEid(111);
        m.setEname("Achyuth");
        System.out.println(m.getEid());
        System.out.println(m.getEname());

    }
}
