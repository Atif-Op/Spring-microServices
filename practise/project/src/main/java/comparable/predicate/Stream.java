package comparable.predicate;

import comparable.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

interface Car1 {
    Car1 getCar(Car c);
}

public class Stream{


    public static void main(String[] args) {
        List<Car> li = new ArrayList<>();
        li.add(new Car("toyota", 2000));
        li.add(new Car("marauti", 1000));
        li.add(new Car("audi", 5000));
        li.add(new Car("bmw", 7000));

        for (Car newcar:li) {
            if(newcar.price<5000){
                System.out.println(newcar);

        }

        }


//        Predicate<Car> c = car -> car.price < 5000;
//        for (Car newCar : li) {
//            if (c.test(newCar)) {
//                System.out.println(newCar);
//            }

//li.stream().filter(car->car.price>5000).forEach(System.out::println);

        li.stream().map(car->car.carName.length()).forEach(System.out::println);



//        List<Integer> n=new ArrayList<>();
//
//        li.stream().filter(car -> car.price>1000).forEach(car-> System.out.println(car));
//        n=li.stream().map(car -> car.carName.length()).collect(Collectors.toList());
//        System.out.println(n);

//        List<Car> newList=li.stream().filter(car ->car.price>1000).collect(Collectors.toList());
//        System.out.println(newList);
//
//        li.stream().forEach(System.out::println);


//        Predicate<Car> p=car->car.price<5000;
//        for (Car newcar:li) {
//            if(p.test(newcar)){
//                System.out.println(newcar);
//            }
        // }
List<Integer> list=List.of(1,2,3,4,5,6,7,8);
list.stream().map((Integer i)->i+1).forEach(System.out::println);


Predicate<Integer> p=(Integer i)->i>20;

    }
Car1 car= (car1) ->null;




}
