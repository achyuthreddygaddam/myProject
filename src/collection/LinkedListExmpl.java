package collection;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExmpl {

    public static void main(String[] args) throws Exception {
        LinkedList<String> ls = new LinkedList<>();
        ls.add("Achyuth");
        ls.add("Reddy");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int choice = 0;
        String element;
        int position;


        while (choice < 4) {
            System.out.println("Operations we are doing: ");
            System.out.println("Adding element in case:1");
            System.out.println("Removing element in case:2");
            System.out.println("Setting element in case:3 ");
            System.out.println("Exit:4");
            System.out.println("Enter choice: ");
            choice = Integer.parseInt(br.readLine());

            switch (choice) {
                case 1:
                    System.out.println("Enter element: ");
                    element = br.readLine();
                    System.out.println("Enter position:");
                    position = Integer.parseInt(br.readLine());
                    ls.add(position, element);
                    break;
                case 2:
                    System.out.println("Enter Position: ");
                    position = Integer.parseInt(br.readLine());
                    ls.remove(position);
                    break;
                case 3:
                    System.out.println("Enter element: ");
                    element = br.readLine();
                    System.out.println("Enter position: ");
                    position = Integer.parseInt(br.readLine());
                    ls.set(position, element);
                    break;
                default:
                    return;
            }

            Iterator it = ls.iterator();

            while (it.hasNext())
                System.out.println(it.next()+" ");

        }

    }
}
