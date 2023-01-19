package comparable.predicate;

import java.util.ArrayList;
import java.util.List;

public class Predicate implements java.util.function.Predicate {

    public boolean test(Object o) {
        return false;
    }

    public static void main(String[] args) {
        List<Car> li=new ArrayList<>();
        li.add(new Car("toyota",2000));
        li.add(new Car("marauti",1000));

            java.util.function.Predicate<Car> p=car1 -> car1.price>500;

        for (Car newCar:li) {
            if(p.test(newCar)){
                System.out.println(newCar);
            }
        }



    }

}
