package FuncsionalPr;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue1 { // birinci daxil olan birinci cixir
    public static void main(String[] args){
 Queue <String> novbe =new LinkedList<>();
        novbe.add("Mubariz");
        novbe.add("Rahid");
        novbe.add("Nigar");
        System.out.println("Novbe: " + novbe);




             Queue <Integer> edeler = new PriorityQueue<>(); // Kicikden boyuye dogru

         edeler.add(78);
        edeler.add(738);
        edeler.add(152);
        edeler.add(3214);
        edeler.add(426);
        edeler.add(741278);
         System.out.println("Kicikden boyuye dogru: " + edeler);

    }
}
