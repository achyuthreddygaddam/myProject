package basicpackage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreatingFile {

    public static void main(String[] args) throws IOException {
        File file = new File("C://temp//file1.txt");

        if (file.createNewFile()){
            System.out.println("file created");
        }
        else {
            System.out.println("file exists");
        }

        FileWriter writer = new FileWriter(file);


        String a = "Achyuth";
        writer.write(a);
        writer.close();


        File file2 = new File("c://temp//file2=.txt");

        if (file2.createNewFile()){
            System.out.println("File created");
        }
        else {
            System.out.println("File already exists");
        }
        FileWriter write1 = new FileWriter(file2);

write1.write("New File Again");
        write1.close();
            }
        }







