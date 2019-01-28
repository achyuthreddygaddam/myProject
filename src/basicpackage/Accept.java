package basicpackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Accept {

    public void m1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter you String: ");
        String ch = br.readLine();
        System.out.println("Your String: " + ch);
    }

    public static void main(String[] args) throws IOException {
        Accept t = new Accept();
        t.m1();
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Number: ");
        int a = Integer.parseInt(br1.readLine());
        System.out.println("Your Number: " + a);


    }

}
