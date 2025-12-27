package Metodd;

public class EqualsAndBeraber {
    public static void main(String[] args){


    String s1 = "Salam";
    String s2 = new String("Salam");

    System.out.println(s1==s2); // iki obyektin yaddaşdakı eyni ünvanı olub-olmadığını yoxlayır,
    System.out.println(s1.equals(s2));  // equals mezmunu muqayise edir. dogrudur

}
}