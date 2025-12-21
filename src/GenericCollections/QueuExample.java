package GenericCollections;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueuExample {
    public static void main(String[] args){

        Queue<String> sira = new LinkedList<>();
        sira.add("Ali");
        sira.add("Vali");
        sira.add("Leyla");
        sira.add("Sona");
        System.out.println(sira);
        System.out.println(sira.poll());
        System.out.println(sira.equals("Ali"));

        System.out.println(sira.poll());


        System.out.println(sira.poll());


    }
}
