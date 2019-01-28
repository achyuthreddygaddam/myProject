package com.company;

public class StaticClass {

    int r_no;
    String name;
    static String college = "JNTU";

    StaticClass(int i, String s){
        r_no = i;
        name = s;
    }
    void display(){
        System.out.println("r_no : " + " " + r_no+"\n"+ "Name : " + name +"\n" + "College : "+ college );
    }

    public static void main(String[] args) {
        StaticClass SC = new StaticClass(1, "Achyuth");
        StaticClass SC1 = new StaticClass(2, "Reddy");
        SC.display();
        SC1.display();


        

    }

}
