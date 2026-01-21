package Collections;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args){
        Set<Integer> nubmers = new HashSet<>(); //tekrarlanmir
        nubmers.add(1);
        nubmers.add(12);
        nubmers.add(15);
        nubmers.add(15);
        nubmers.add(1);
        System.out.println(nubmers);
    }
}
