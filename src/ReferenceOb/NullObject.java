package ReferenceOb;

public class NullObject {
    public static void main(String[] args) {

        Catt Cat1 = null; // Cat1 hələ obyektə işarə etmir

        if (Cat1 == null) {
            System.out.println("Cat1 yaradilmayib");
        }

        // Obyekti null-dan çıxarmaq
        Cat1 = new Catt("Tom", "Black"); // artıq yeni obyektə işarə edir
        System.out.println(Cat1.name);  // Çıxış: Tom
    }
}


class Catt {
    String name;
    String color;

    Catt(String name, String color) {
        this.name = name;
        this.color = color;
    }
}