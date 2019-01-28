package com.stringmanipulation;

public class Converting {
    void display() {


        //String to StringBuffer
        String s = "achyuth";
        StringBuffer sb = new StringBuffer(s);

        System.out.println(sb);


        //StringBuffer to String
        StringBuffer sb1 = new StringBuffer("Reddy");
        String ss = sb1.toString();

        System.out.println(ss);
    }

    public static void main(String[] args) {
        Converting C = new Converting();
        C.display();
    }

}
