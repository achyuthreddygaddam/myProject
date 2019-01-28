package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();

        hs.add("India");
        hs.add("America");
        hs.add("China");
        hs.add("Japan");
        Iterator it = hs.iterator();

        while (it.hasNext()) {
            String s = (String) it.next();

            System.out.println(s);
        }

    }
}
