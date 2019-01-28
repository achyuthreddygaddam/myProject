package inputandoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class One {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter 'a' value: ");
        int a = Integer.parseInt(br.readLine());
        System.out.println("A value: "+ a);

        System.out.println("Enter name: ");
        String name = br.readLine();
        System.out.println("Name: "+ name);

    }

}
