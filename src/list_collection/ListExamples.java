package list_collection;

import java.util.ArrayList;
import java.util.List;

public class ListExamples {
//ways to create lists
    public static void main(String[] args) {
        List<Integer> list1 =  new ArrayList<>() ;
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        List<Integer> list2 = new ArrayList<>(list1.subList(0,2));
        System.out.println(list1);
        List<Integer> list3 =  new ArrayList<>(10) ;
    }
}
