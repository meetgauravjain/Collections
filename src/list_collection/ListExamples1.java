package list_collection;

import java.util.ArrayList;
import java.util.List;

public class ListExamples1 {
//ways to create lists
    public static void main(String[] args) {
        List<Integer> list1 =  new ArrayList<>() ;
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(7);
        list1.add(8);
        List<Integer> list2 = new ArrayList<>(list1.subList(0,2));
        System.out.println(list2);
        List<Integer> list3 =  new ArrayList<>(10) ;

        Integer i = 11;
        Integer i2 = 8;
        System.out.println(list1.remove(i));
        System.out.println(list1.remove(i2));
        System.out.println(list1);
        list1.removeAll(list1);
        System.out.println(list1);
    }
}
