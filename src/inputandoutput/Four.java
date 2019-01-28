package inputandoutput;

import java.util.Scanner;

public class Four {

    public static void main(String[] args) {

        System.out.println("Enter name, age, salary");
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        int age = sc.nextInt();
        int salary = sc.nextInt();

        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Salary: "+ salary);
    }

}
