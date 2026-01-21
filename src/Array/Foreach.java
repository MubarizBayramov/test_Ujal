package Array;

import java.util.ArrayList;
import java.util.List;

public class Foreach {
    public static void main(String[] args){
        List<String> ad = new ArrayList<>();
        ad.add("David");
        ad.add("Rabbit");
        ad.add("snacke");
        for (String adlar : ad){
            System.out.println(adlar);

        }
    }
}
