package Metodd;

public class RecordExample {  //immutable (dəyişməz) obyektlər üçün istifadə olunur/ yalnız məlumat saxlamaq üçün sadə obyektlər yaratmaq.
    public static void main(String[] args) {

        Person P = new Person("Mubariz", 25);
        System.out.println(P.name());
        System.out.println(P.age());
        System.out.println(P);


    }


    record Person(String name, int age) {}


}
