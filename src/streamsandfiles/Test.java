package streamsandfiles;

import java.io.DataInputStream;
import java.io.FileOutputStream;

public class Test {

    public static void main(String[] args) throws Exception {

        DataInputStream dis = new DataInputStream(System.in);

        FileOutputStream fout = new FileOutputStream("c://file.txt");
        System.out.println("Enter char(@ at the end): ");
        char str;

        while ((str = (char) dis.read())!='@')
            fout.write(str);
            fout.close();


    }
}
