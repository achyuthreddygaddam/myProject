package com.learnarrays;

public class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + "" + name;
    }


    public static void main(String[] args) {

        Employee[] a = new Employee[5];

        Employee e = new Employee(111, " Achyuth");
        Employee e1 = new Employee(222, " Reddy");
        Employee e2 = new Employee(333, " Gaddam");

        a[0] = e;
        a[1] = e1;
        a[2] = e2;

        for(Employee aa:a){
            System.out.println(aa);
        }

        for (Object d : a) {
            if(d instanceof Employee){
                Employee ed = (Employee)d;
                System.out.println(ed.toString());
            }
//            if(d==null){
//                System.out.println(d);
//            }

        }


    }

}
