package inputandoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Two {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter name, age, salary");

        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str, ", ");

        String st1 = st.nextToken();
        String st2 = st.nextToken();
        String st3 = st.nextToken();

        String name = st1;
        int age = Integer.parseInt(st2);
        float salary = Float.parseFloat(st3);

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);


        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Two Numbers: ");

        String str1 = br1.readLine();

        StringTokenizer stk = new StringTokenizer(str1, ", ");

        Double d1 = Double.parseDouble(stk.nextToken());
        Double d2 = Double.parseDouble(stk.nextToken());

        System.out.println("Addition: "+ (d1+d2));
        System.out.println("Subtraction: "+ (d1-d2));
        System.out.println("Multiplication: "+(d1*d2));
        System.out.println("Division: "+ (d1/d2));




    }

}
