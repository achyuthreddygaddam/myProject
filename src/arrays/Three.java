package arrays;

public class Three {

    public static void main(String[] args) {

        int marks[][] = {{6, 7, 8,9,10},
                {10, 20, 30, 40, 50},
                {1, 2, 3, 4, 5}};

        for (int i = 0; i <3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(marks[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
