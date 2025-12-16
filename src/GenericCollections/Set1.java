package GenericCollections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set1 {
    public static void main(String[] args){
        Set<String> car = new HashSet<>();
        car.add("Mersi");
        car.add("bmw");
        car.add("toyota");
        car.add("nisan");
        car.add("rr");
        car.add("ferrar");
        car.add("Mersi"); // tekrarlamir

        System.out.println(car);
        System.out.println(car.contains("banan")); // yoxdur deye false


        Set<String> cars = new TreeSet<>();
        cars.add("Mersi");
        cars.add("bmw");
        cars.add("toyota");
        cars.add("nisan");
        cars.add("rr");
        cars.add("ferrar");
        cars.add("Mersi"); // tekrarlamir
        System.out.println(cars);
        System.out.println(cars.contains("banan")); // yoxdur deye false


        Set<String> Car = new LinkedHashSet<>();
        Car.add("Mersi");
        Car.add("bmw");
        Car.add("toyota");
        Car.add("nisan");
        Car.add("rr");
        Car.add("ferrar");
        Car.add("Mersi"); // tekrarlamir

        System.out.println(Car);
        System.out.println(Car.contains("banan")); // yoxdur deye falsee
    }
}
