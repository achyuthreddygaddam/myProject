package basicpackage;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Basics {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter name: ");

        String name = br.readLine();


        System.out.println("Enter age: ");

        int age = Integer.parseInt(br.readLine());


        System.out.println("Enter sex: ");
        char sex = br.readLine().charAt(0);
        //char sex = (char) br.read();
        //br.skip(1);


        System.out.println("Enter Marital Status: ");
        String marriage = br.readLine();


        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Sex: " + sex);
        System.out.println("Marital Status: " + marriage);


    }
}
