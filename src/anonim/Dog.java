package anonim;

public class Dog {
    public static void main(String[] args) {
        Animal Dog = new Animal() {
            @Override
            public void sound() {
                System.out.println("Hav");
            }
        };
Dog.sound();
    }}