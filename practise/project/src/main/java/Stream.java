import javax.swing.text.html.Option;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

interface B {
    void doWork();
}

public class Stream  {
    public static void main(String[] args) {
//        List <String>l1 = Arrays.asList("a", "b", "c");

//      List <List<String>> newList=List.of(l1,l2);
//        List <String> finalList=newList.stream().flatMap(li->li.stream().map(i->i+1)).collect(Collectors.toList());
//        System.out.println(finalList);
//        String name = null;
//        Optional<String> p = Optional.ofNullable(name);
//        System.out.println(p.orElse("atif"));
        String name = null;
        Optional<String> p = Optional.ofNullable(name);
        System.out.println(p);



    }
}


