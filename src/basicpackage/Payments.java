package basicpackage;

public class Payments {

    public static void main(String[] args) {
        int[] salaries = {5000, 4000, 6000, 7000, 8000};

        int[] counts = {1, 2, 3, 4, 5};

        String a = "basics";

        String[] str = {"achyuth", "reddy", "gaddam"};


        for (String comp:str) {
            System.out.println("First Name: "+ str[0]);
            System.out.println("Middle Name: "+ str[1]);
            System.out.println("Last Name: "+ str[2]);
        }


        switch (a) {

            case "basics":
                System.out.println("Printing Monday");
                break;
            case "Tue":
                System.out.println("Printing Tuesday");
                break;
            default:
                System.out.println("None of the values");
                break;

        }


        for (String abc : str) {
            System.out.println("Values of string array: " + abc);
        }


        for (int i = 0; i < salaries.length; i++) {

            System.out.println("value at index: " + i + " is " + salaries[i]);


            for (int j = 0; j < counts.length; j++) {
                System.out.println("\t"+"values of j: " + counts[j]);
            }

        }
        int i = 0;
        while (i < salaries.length) {
            System.out.println(salaries[i]);
            i++;
        }

        int x = 1;
        do {
            System.out.println("number: " + x);
            x++;
        }
        while (x <= 10);


        while (x <= 10) {
            System.out.println("New Numbers: " + x);
            x++;
        }
        if (x == 2) {
            System.out.println(x);
        } else {
            System.out.println("wrong number");
        }

    }
}
