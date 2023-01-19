package comparable.predicate;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class FlatMap {

    public static void main(String[] args) {
        List <Integer>list= List.of(1,4);
        List <Integer>list1= List.of(5,6);
        List <Integer>list2= List.of(2,3);
        List<List<Integer>> newList=List.of(list,list1,list2);
        for (List<Integer>newList1:newList) {
//            for (Integer newList2:newList1) {
                System.out.println(newList1);
            }
        }


    }

