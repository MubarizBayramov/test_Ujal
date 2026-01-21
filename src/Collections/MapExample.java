package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {
    public static void main(String[] args){
        Map<Integer, String> number = new HashMap<>();
        number.put(11, "ali");
        number.put(2, "veli");
        System.out.println(number);

        Map<Integer, String> number2  = new TreeMap<>();
        number2.put(1, "orxan");
        number2.put(2, "ayxan");
        number2.put(4, "tural");
        number2.put(3, "elsen");
        number2.remove(3); // 3 silindi
        System.out.println(number2);

        Map<Integer, String> number3 = new LinkedHashMap<>();
        number3.put(6, "Polad");
        number3.put(5, "burla");
        System.out.println(number3);



    }
}
