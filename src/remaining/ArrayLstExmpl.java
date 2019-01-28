package remaining;

import java.util.ArrayList;

public class ArrayLstExmpl {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();

        ArrayList<Integer> alist = new ArrayList<Integer>();

        list.add("Achyuth");
        list.add("Reddy");
        list.add("Gaddam");

        for (String lst:list) {
            System.out.println(lst);
        }
    }

}
