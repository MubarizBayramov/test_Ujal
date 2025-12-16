package Polymorphism;

public class Main {
    public static void  main(String[] args){
Calculator calc = new Calculator();
System.out.println(calc.reqem(2,3)); // Compile-time (Static) Polymorphism → Metod overloading
        System.out.println(calc.reqem(2,3,4)); //Compile-time (Static) Polymorphism → Metod overloading
    }
}
