package streamsandfiles;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReading {
    public static void main(String[] args) throws IOException {


        FileInputStream fin = new FileInputStream("c://file.txt");

        System.out.println("File Contents: ");

        int ch;
        while ((ch=fin.read()) != -1)
            System.out.println((char)ch);
            fin.close();

    }
}
