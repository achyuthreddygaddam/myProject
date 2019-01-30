import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name:");
        String name = sc.nextLine();
        System.out.println("Enter Address: ");
        String address = sc.nextLine();
        System.out.println("Enter Contact: ");
        String cell = sc.nextLine();
        System.out.println("Name: " + name + "\nAddress: "+address + "\nCell: " + cell);
    }
}
