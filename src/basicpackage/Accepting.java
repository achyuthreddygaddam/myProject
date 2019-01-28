package basicpackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Accepting {

    public static void main(String[] args)throws IOException {

BufferedReader br4 = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Name, Age, Salary");
        String s = br4.readLine();

        StringTokenizer st = new StringTokenizer(s," ");

        String s1 = st.nextToken();
        String s2 = st.nextToken();
        String s3 = st.nextToken();

        String name = s1;
        int age = Integer.parseInt(s2);
        int salary = Integer.parseInt(s3);

        System.out.println("name: "+ name);
        System.out.println("age: "+ age);
        System.out.println("salary: "+ salary);





        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Gender:");

        char ch = (char)br.read();


        System.out.println("Enter your name:");
        String str = br1.readLine();


        System.out.println("Enter salary:");

        int i = Integer.parseInt(br2.readLine());

        System.out.println("Enter Company:");
        String b = br3.readLine();


        System.out.println("Name: "+ str);
        System.out.println("Gender: "+ ch);
        System.out.println("Salary: "+ i);
        System.out.println("Company: "+ b);


    }
}
