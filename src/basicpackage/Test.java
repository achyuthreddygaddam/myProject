package basicpackage;

import java.lang.String;

public class Test {
    public static void main(String[] args) {

        int a = 20;
        int b = 10;


        for (int i = 1; i <= 20; i++) {
            System.out.println("b values: " + i);
        }


        if (b == 10 && a == 10) {

            System.out.println("Both are true");

        } else if (a == 20 && b == 10) {
            System.out.println("In the middle");
        } else {
            System.out.println("Both are false");
        }


//        String str = "achyuth";
//        if (str == "achyuth") {
//            System.out.println("achyuth");
//        } else {
//            System.out.println(30);
//        }
//        switch (str) {
//            case "achyuth":
//                System.out.println("reddy");
//                break;
//            default:
//                System.out.println("default value");
//                break;

       // }
    }
}
