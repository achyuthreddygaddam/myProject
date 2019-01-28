package remaining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Employee {


    public static void main(String[] args) throws IOException {

        InputStreamReader obj = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(obj);

        System.out.println("Enter Employee name: ");
        String name = br.readLine();

        System.out.println("Enter Age: ");
        int age = Integer.parseInt(br.readLine());

        System.out.println("Enter Employee Gender: ");
        char sex = br.readLine().charAt(0);


        System.out.println("Enter Company: ");
        String company = br.readLine();
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Age: " + age);
        System.out.println("Gender: " + sex);
        System.out.println("Company: " + company);
    }


}
