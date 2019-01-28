package collection;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Group {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Employee[] arr = new Employee[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter id: ");
            int id = Integer.parseInt(br.readLine());
            System.out.println("Enter Name: ");
            String name = br.readLine();
            arr[i] = new Employee(id, name);
        }

        System.out.println("Employee Data: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i].displayData();
        }

    }


}
