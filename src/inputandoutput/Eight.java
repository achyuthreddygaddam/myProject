package inputandoutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Eight {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your Collections.Details: ");

        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str, ",");

        String s1 = st.nextToken();
        String s2 = st.nextToken();
        String s3 = st.nextToken();
        String s4 = st.nextToken();

        String name = s1;

        int age = Integer.parseInt(s2);

        char sex = s3.charAt(0);

        float salary = Float.parseFloat(s4);

        String all = String.format("Name= %s%nAge= %d%nSex= %c%nSalary= %f",name,age,sex,salary);

//        System.out.println("Name:" + name + "\n" + "Age: " + age + "\n" + "Sex: " + sex + "\n" + "Salary: " + salary);
        System.out.println(all);

    }
}
