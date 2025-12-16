package Polymorphism;

public class AudiMersiMain {
    public static void main(String[] args){

Car c1 = new Mersi(); // Runtime (Dynamic) Polymorphism → Metod overriding
Car c2 = new Audi(); // Runtime (Dynamic) Polymorphism → Metod overriding

c1.ses();
c2.ses();

    }
}
