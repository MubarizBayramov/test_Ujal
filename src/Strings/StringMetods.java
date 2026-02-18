package Strings;

import java.util.Locale;

public class StringMetods {
    public static void main(String[] args){

        String s = "  Java Programming  ";
        System.out.println(s.hashCode());
        System.out.println(s.toLowerCase());
        System.out.println(s.length());
        System.out.println(s.toUpperCase(Locale.ROOT));
        System.out.println(s.indexOf(2));
    }
}
