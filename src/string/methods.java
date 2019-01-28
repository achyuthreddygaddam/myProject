package string;

public class methods {


    public static void main(String[] args) {
        String s = "hello apple";
        String ss = "apple";
        String s1 = new String("Achyuth");
        char[] ch = {'a', 'i', 'r'};
        String s3 = new String(ch);

        String str = "Hi this is Achyuth";

        String[] sp = str.split(" ");
//        System.out.println(sp);

        for (int i = 0; i < sp.length; i++) {
            System.out.println(sp[i]);
        }
        char[] arr = new char[15];
        str.getChars(3, 18, arr, 0);

        System.out.println(arr);


        String sub = s.substring(6, 11);
        System.out.println("SubString: " + sub);

        String s4 = s.concat(s1);
        System.out.println("Concat: " + s4);

        System.out.println("Last Index: " + s.lastIndexOf(ss));

        System.out.println("Index: " + s.indexOf(ss));

        System.out.println("Endswith: " + s.endsWith(ss));

        System.out.println("Startswith: " + s.startsWith(ss));

        System.out.println("Equals: " + s.equals(ss));

        System.out.println("CharAt: " + s3.charAt(2));

        System.out.println("Length: " + s3.length());

        System.out.println("CompareTo: " + s.compareTo(ss));

    }


}
