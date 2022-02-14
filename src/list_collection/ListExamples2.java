package list_collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExamples2 {
    public static void main(String[] args) {
        List<String> list =  new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.replaceAll(s -> s.toUpperCase());
        System.out.println(list);

        //indexOf
        //lastIndexOf
        //contains()
        //set
        //replaceAll

        Iterator<String> itr = list.iterator();
        System.out.println(itr);
        itr.forEachRemaining(s -> System.out.println(s));
        //itr.forEachRemaining(s -> itr.remove());
        System.out.println(list);
        itr = list.iterator();
        list.add("Mango");

        while (itr.hasNext()) {
      System.out.println(itr.next());
        }
    System.out.println(list);
    }
}
