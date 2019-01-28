package inputandoutput;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Three {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Year: ");

        String str = br.readLine();

        int year = Integer.parseInt(str);

        if (year % 100 == 0 && year % 400 == 0) {
            System.out.println("It is a Leap Year");
        }
        else if(year%100!=0&&year%4==0){
            System.out.println("It is a Leap Year");
        }
        else {
            System.out.println("It is not a Leap Year");
        }
    }
}
