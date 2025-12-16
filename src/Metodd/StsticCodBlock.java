package Metodd;

public class StsticCodBlock {

    static int a;
    static{
        a = 100; // Static dəyişəni burada başlatmaq
        System.out.println("Static block işləyir!");

    }

public static void main(String[] args){
    System.out.println("Main metodu isleyir");
    System.out.println("a: " + a);


}


}
