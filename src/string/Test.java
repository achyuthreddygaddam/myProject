package string;

public class Test {

    String s = "hello";
    String name = new String(" Achyuth");
    char[] arr = {'c', 'h', 'a', 'i', 'r', 's'};

    String str = new String(arr);

    String s4 = name.trim();


    public String main() {

        System.out.println("S: " + s + " \nName: " + s4 + " \nStr: " + str);

        return s + "" + name + "" + str;
    }

    public static void main(String[] args) {

        Test t = new Test();


        String s2 = t.s.concat(t.name);

        System.out.println(s2);

        t.main();

    }
}
