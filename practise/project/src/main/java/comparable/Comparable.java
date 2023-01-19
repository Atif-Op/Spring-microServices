package comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Comparable {


    public static void main(String[] args) {
        List<Employee> al = new ArrayList<>() ;
        al.add(new Employee(2, "vishal"));
        al.add(new Employee(1, "atif"));

        System.out.println(al);
        // Collections.sort(al,new IdComparator());


        System.out.println(al);

        Comparator<Employee> compare;

//        Collections.sort(al,(Employee o1, Employee o2)-> {
//                    return o1.getName().compareTo(o2.getName());
//                }
//
//        );
        Collections.sort(al,Comparator.comparing(Employee ::getName));
        System.out.println(al);
    }

    };



