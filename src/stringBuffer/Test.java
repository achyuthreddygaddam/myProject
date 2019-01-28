package stringBuffer;

public class Test {

    public static void main(String[] args) {

        String s = "Hello Java";

        String ss = "Java";

        StringBuilder sb1 = new StringBuilder("Achyuth");

        sb1.append(" Good");
        sb1.replace(8,12,"is a Good Boy");
        sb1.insert(11,"not ");
        System.out.println(sb1);

        StringBuffer sb = new StringBuffer(s);

        String sub  = sb.substring(6);
        System.out.println(sub);
        System.out.println(sb.indexOf("l"));
        System.out.println(sb.lastIndexOf("l"));

        System.out.println(sb);


    }


}
