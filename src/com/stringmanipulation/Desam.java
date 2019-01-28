package com.stringmanipulation;

public class Desam {


    int a ;
    String s;

    Desam(int num, String lost){
        this.a = num;
        this.s = lost;
    }

public String toString(){
        return a +" "+ s;
}

    public static void main(String[] args) {
        String name = "Achyuth";

        StringBuffer sb = new StringBuffer("Reddy");

        Desam d = new Desam(10, "win");

        System.out.println(d.toString());
        name.concat(" Gaddam");

        System.out.println(name);
        System.out.println(sb);


    }
}
