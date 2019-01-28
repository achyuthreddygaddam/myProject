package basicpackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Basics1 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Name,Age,,Salary,Company ");

        String s = br.readLine();

        StringTokenizer st = new StringTokenizer(s," ");

        String s1 = st.nextToken();
        String s2 = st.nextToken();

        String s4 = st.nextToken();
        String s5 = st.nextToken();

        String name = s1;
        int age = Integer.parseInt(s2);

        int salary = Integer.parseInt(s4);
        String company = s5;

        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Salary: "+ salary);
        System.out.println("Company: "+ company);

    }
}
