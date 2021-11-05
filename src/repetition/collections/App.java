package repetition.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Hello");
        al.add("another word");
        al.add("Testing");

        for(String o : al)
            System.out.println(o);

        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(50);
        ll.add(23);
        ll.add(456);

        for(int x : ll)
            System.out.println(x);
    }
}