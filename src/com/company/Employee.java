package com.company;

public class Employee {

    int id;
    String name;
    int salary;

    Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return id + " " + name + " " + salary;
    }

    public static void main(String[] args) {

        Employee e = new Employee(111, "Achyuth", 7000);
        Employee e1 = new Employee(222, "Gaddam", 8000);

        Employee[] aa = new Employee[5];
        aa[0] = e;
        aa[3] = e1;

        for (Employee ab : aa) {

        }

        for (Object obj : aa) {
            if (obj instanceof Employee) {
                Employee emp = (Employee) obj;
                System.out.println(emp.id+" "+ emp.name+" "+ emp.salary);
            }
            if (obj == null) {
                System.out.println(obj);

            }


//        System.out.println(e.toString());

        }
    }
}
