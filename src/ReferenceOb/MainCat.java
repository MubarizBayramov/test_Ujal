package ReferenceOb;

class Cat {
    String name;
    String color;

    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
    }
}

public class MainCat {
    public static void main(String[] args) {
        Cat Cat1 = new Cat("Tom", "Black");
        Cat Cat2 = Cat1; // eyni obyektin referansını paylaşır
        Cat2.name = "Max";

        System.out.println(Cat1.name); // Çıxış: Max
    }
}
