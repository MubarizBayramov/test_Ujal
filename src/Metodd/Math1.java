package Metodd;

public class Math1 {

    public static void main(String[] args) {
        int a = -15;
        int b = 8;

        Math.abs(a);
        Math.absExact(a);
        Math.max(a, b);
        Math.min(a, b);
        Math.pow(a, b);
        Math.sqrt(a);
        Math.round(b);
        Math.floor(a);
        Math.ceil(b) ;
        Math.random();
        System.out.println("Modul (abs): " + Math.abs(a)); // modulu
        System.out.println("Modul (abs): " + Math.absExact(a));
        System.out.println("Max (abs): " + Math.max(a, b)); // max
    }
}
