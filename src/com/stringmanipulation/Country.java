package com.stringmanipulation;

public class Country {
    String emp;
    String company;



    Country(String emp, String company) {
        this.emp = emp;
        this.company = company;
    }


    public String toString() {
        return emp + " " + company;
    }


    public static void main(String[] args) {

        String s = new String("alexa");

        int ab = 10;



        String name = "name";

        String lastName = new String("surname");

        StringBuffer sb = new StringBuffer("Achyuth");
        StringBuffer sb1 = new StringBuffer("Reddy");

        Country C = new Country("achyuth", "ford");


        System.out.println(C.toString());
        System.out.println(name.toString());
        System.out.println(lastName.toString());
        System.out.println(sb.append(sb1).toString());
        System.out.println(sb1.toString());
        name.concat(" is");
        System.out.println(name);

        System.out.println(sb.toString());

        System.out.println(sb == sb1);
        System.out.println(name == lastName);

        System.out.println(s);


        System.out.println(ab);
    }

}