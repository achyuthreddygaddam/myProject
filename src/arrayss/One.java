package arrayss;

import java.io.IOException;
import java.util.Scanner;

public class One {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int[] array = new int[8];
        System.out.println("Enter values: ");

        for(int i =0;i<=array.length;i++){

            array[i] = sc.nextInt();
            System.out.println("Your values: "+ array[i]);
        }

    }
}
