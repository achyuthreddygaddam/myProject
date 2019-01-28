package inputandoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Seven {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Gender: ");

        char gender = br.readLine().charAt(0);


        System.out.println("Enter Name: ");

        String name = br.readLine();

        System.out.println("Enter Age: ");

        int age = Integer.parseInt(br.readLine());

        System.out.println("Name: " + name);

        System.out.println("Age: " + age);

        System.out.println("Gender: " + gender);


    }

}
