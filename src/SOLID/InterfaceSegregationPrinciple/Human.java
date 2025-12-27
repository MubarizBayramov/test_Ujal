package SOLID.InterfaceSegregationPrinciple;

public class Human implements Worker, Eatable {
    @Override
    public void eat() {
        System.out.println("Insan yeyir");

    }

    @Override
    public void work() {
        System.out.println("Insan isleyir");

    }

    public static void main(String[] args){
        Human H = new Human();
        H.work();
        H.eat();
            }
}
