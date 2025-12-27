package Metodd;

public class CloneClass implements Cloneable {
    String name;
    int age;

    CloneClass(String name, int age) {
        this.name = name;
        this.age = age;

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {

        return name + " - " + age;

    }
}
class Main1 {
        public static void main(String[] args) throws CloneNotSupportedException{
        CloneClass CC1 = new CloneClass("Mubariz", 45);
        CloneClass CC2 = (CloneClass) CC1.clone();

System.out.println(CC1);
System.out.println(CC2);
System.out.println(CC1==CC2);

    }

    }


