package GenericCollections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args){

        ArrayList <String> fruit = new ArrayList<>();
        fruit.add("alma");
        fruit.add("armud");
        fruit.add("heyvna");
        fruit.add("nar");

        Iterator<String> IT = fruit.iterator();
        while (IT.hasNext()) {
            String item = IT.next();

            System.out.println(item);
        }

    }
}
