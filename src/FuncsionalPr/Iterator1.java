package FuncsionalPr;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator1 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Muba");
        names.add("Nuba");
        names.add("ALa");
        names.add("Bunla");
        names.add("Yes");
        names.add("Baba");
        names.add("Nene");
        names.add("Orxan");


        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);

            if (name.equals("Bunla")) {
                iterator.remove();
            }



        }
        System.out.println("Silinmədən sonra: " + names);
    }
}