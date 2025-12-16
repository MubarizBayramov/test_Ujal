package ObjectClass.This;

public class Car {
    String name;
    String color;



    public Car(String name, String color) {
        this.name = name;
        this.color = color;

    }

        void start(){
            System.out.println("name: " + name);
            System.out.println("color: " + color);
        }
    }

