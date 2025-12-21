package GenericCollections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args){

        Map<String, Integer> ages = new HashMap<String, Integer>();
        ages.put("Ali", 25);
        ages.put("Veli", 26);
        ages.put("Leyla", 87);

        System.out.println(ages);
        System.out.println(ages.get("Ali")); // alinin yasini gosterir
            }
}
