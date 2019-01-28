package com.learnarrays;

public class Steps {


    public static void main(String[] args) {

        int[] a;
        a = new int[5];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;
        int[] c = new int[2];
        c[0] = 11;
        c[1] = 12;

        int[] d = {10, 20, 30, 40};

        System.out.println(c[0]);
        System.out.println(c[1]);

        for (int dd:d)
        {
            System.out.println(dd);
        }
        for (int i = 0; i<a.length; i++){
            System.out.println(a[i]);
        }




    }
}

