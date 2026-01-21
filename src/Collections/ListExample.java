package Collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args){
        List<String> names = new ArrayList<>(); // tekrarlanir
        names.add("orxan");
        names.add("alma");
        names.add("orxan");
        names.add("orxan");
        names.add("nigar");
        System.out.println(names);

    }
}
