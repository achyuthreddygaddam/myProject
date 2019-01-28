package com.learnarrays;

public class BasicArrayProgram {

    public static void main(String[] args) {
        int[] a = new int[5];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;


        System.out.println(a[0]);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        for (int ab : a) {
            System.out.println(ab);
        }
    }
}
