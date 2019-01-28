import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class Example {
    public static void main(String[] args) {

        LinkedList<String> ls = new LinkedList<>();
        ls.add("Achyuth");
        ls.add("Ramesh");
        ls.add("Suresh");
        Iterator it = ls.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        HashSet<String> hs = new HashSet<>();
        hs.add("Reddys");
        hs.add("Gaddam");
        Iterator i = hs.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

    }
}
