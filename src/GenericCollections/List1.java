package GenericCollections;

import java.util.ArrayList;
import java.util.LinkedList;

public class List1 {
    public static void main(String[] args){
        ArrayList <String> fruits = new ArrayList<>();// array tekrara icaze verir
        fruits.add("alma");
        fruits.add("armud");
        fruits.add("gilas");
        fruits.add("ciyelek");
        fruits.add("nar");
        fruits.add("heyva");
        fruits.add("encir");
        fruits.add("zogal");
        fruits.add("alma");
        fruits.add("armud");
        fruits.add("gilas");

        System.out.println("Meyveler: " + fruits);
        System.out.println("ilk Meyve: " + fruits.getFirst()); // ilk meyve

        fruits.remove("alma"); // alam silindi
        System.out.println("Silindikden sonra: " +fruits);

        System.out.println("silindikden sonra Meyvelerin olcusu: " + fruits.size());

for(String meyve : fruits){  // Dövr ilə çap etmək
    System.out.println(meyve);
}

        LinkedList<String> Fruits = new LinkedList<>();
        Fruits.add("alma");
        Fruits.add("alma");
        Fruits.add("armud");
        Fruits.add("heyva");
        Fruits.add("nar");
        Fruits.add("alma");
        System.out.println(Fruits);

    }



}
