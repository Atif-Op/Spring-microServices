package comparable.predicate;

import java.util.function.Predicate;

interface a{
    int sum(int a);
}
public class SimplePredicate {



    public static void main(String[] args) {

        a obj=(a)->{return 1;};

//        int a = 10;
//        if (a > 20) {
//            System.out.println();
//        }

        Predicate<Integer> p=a->a>20;
        System.out.println(p.test(10));
    }
}
