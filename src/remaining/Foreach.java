package remaining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Foreach {


    public void example(){

        String subject[] = {"Maths","Science","Social"};

        for (String abcd:subject) {
            System.out.println(abcd);
        }
    }

    static String firstName = "Reddy";

    String name = "Achyuth";

    int num = 2;
    int num1 = 10;

    public void callingMethod() {


       while (num !=num1) {
           System.out.println(num);
           break;
       }
        System.out.println(num*num1);
        System.out.println(num+num1);
        System.out.println(num1-num);
        System.out.println(num1%num);
        System.out.println(num1/num);


        String lastName = "Gaddam";

        System.out.println(lastName);

        System.out.println(name);
    }

    public static void main(String[] args) throws IOException {

        System.out.println(Foreach.firstName);

        Foreach fr = new Foreach();

        fr.example();

        fr.callingMethod();

        System.out.println(fr.name);

        String arr[] = {"aa", "bb", "cc"};

        for (String i : arr) {

            System.out.println(i);
        }

        char color = 'g';

        switch (color) {
            case 'g':
                System.out.println("Green");
                break;
            case 'b':
                System.out.println("Blue");
        }

        String day = "Tue";
        switch (day) {
            case "Mon":
                System.out.println("Monday");
                break;
            case "Tue":
                System.out.println("Tuesday");
                break;
            case "Wed":
                System.out.println("Wednesday");
                break;
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String marks[] = {"Achyuth", "Reddy", "Gaddam", "Achyuth", "Reddy"};

        for (String str : marks) {
            System.out.println(str);
        }

//        for (int i = 0; i < 5; i++) {
//            System.out.println("Enter--->"+ i);
//            marks[i] = br.readLine();
//            System.out.println(marks[i]);
//        }
    }
}
