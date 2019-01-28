package arrays;

import java.util.Scanner;

public class Two {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] marks = {40, 50, 60, 70, 80};

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        int[] ab = new int[5];

        System.out.println("Enter ab values");
        for (int i = 0; i <=ab.length; i++) {

            ab[i] = sc.nextInt();
            System.out.println("Values of ab: "+ab[i]);
        }
        System.out.println("End of program");
    }
}
