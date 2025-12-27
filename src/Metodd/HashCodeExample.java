package Metodd;

public class HashCodeExample {
    public static void main(String[] args){

        String s1 = "Birinci deyisen";
        String s2 = new String("ikinci deyisen");

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
