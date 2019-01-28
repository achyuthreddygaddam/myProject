package inputandoutput;

import java.io.BufferedReader;
import java.util.Scanner;

public class Six {

    public static void main(String[] args) {
        String str = "This is a Book";

        int age = 10;
        int count = 20;
        String ss = String.format("str= %s%nage= %d%ncount= %d",str,age,count);

        Scanner scanner = new Scanner(str);

        String s1 = scanner.nextLine();
        System.out.println(ss);

        System.out.println(s1);


    }

}
