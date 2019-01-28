package inputandoutput;

import java.io.File;
import java.util.Scanner;

public class Nine {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("c://file.txt"));

        /*while (sc.hasNext()) {
            int i = sc.nextInt();
            System.out.println("Integer: " + i);
        }*/
        while (sc.hasNext()) {

            String str = sc.next();
            System.out.println(str);
        }
       /* int age = 25;
        float s = 25f;

        String str = String.format("age= %d %nfloat=%f",age,s);
        System.out.println(str);

        System.out.printf("float= %f", s);

        System.out.println("\n" + "Value: " + s);
*/
    }

}
