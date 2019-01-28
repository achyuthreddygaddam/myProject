package com.inheritance;

public class Employee {

    int eid;
    String ename;

    Employee(int eid, String ename){
        this.eid = eid;
        this.ename = ename;

    }
@Override
    public String toString(){
        return eid + " " + ename;
    }

    public static void main(String[] args) {
        Employee e = new Employee(111, "Achyuth");

        System.out.println(e.toString());
    }

}
