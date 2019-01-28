package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

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
