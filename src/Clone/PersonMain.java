package Clone;

public class PersonMain {
    public static void main(String[] args) throws CloneNotSupportedException {

        Person p1 = new Person("Ali", 20);
        Person p2 = (Person) p1.clone();
        Person p3 = (Person) p1.clone();


        p2.name = "Vali";
        p3.age = 33;



        System.out.println(p1.name);
        System.out.println(p2.name); // kopyalanmis obyekt
        System.out.println(p3.age); // kopyalanmis obyekt
    }
}
