package AbstrackAndInterface;


public class Dog extends Animal {
    @Override
    void eat() {
        System.out.println("It yeyir");
    }

    public static void main(String[] args){
        Dog dog = new Dog();
        dog.eat();
    }
}
