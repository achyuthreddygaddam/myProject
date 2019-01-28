package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHash {

    public static void main(String[] args) {

        LinkedHashSet<String> ls = new LinkedHashSet<>();

        ls.add("India");
        ls.add("China");
        ls.add("USA");
        ls.add("Canada");

        for (String str :ls) {
            System.out.println(str);
        }

        /*Iterator it = ls.iterator();

        while (it.hasNext()) {
            String str = (String) it.next();
            System.out.println(str);
        }
*/

    }
}
