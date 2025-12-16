package Metodd;

public class WrapperExcample {
    public static void main(String[] args) {
        int a = 5;
        Integer b = a; // autoboxing ilə int avtomatik Integer obyektinə çevrilir.
        System.out.println("Wrapper obyekti: " + b);




        // Primitive → Wrapper (valueOf() metodu ilə)
        double pi = 3.14;
        Double d = Double.valueOf(pi);
        System.out.println("Double via valueOf(): " + d);



        // Wrapper → Primitive (unboxing)
        int c = b; // Integer → int (autounboxing)
        double pi2 = d.doubleValue(); // metod ilə unboxing

        System.out.println("Unboxed int: " + c);
        System.out.println("Unboxed double: " + pi2);
    }



}

