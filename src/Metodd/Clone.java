package Metodd;

public class Clone{
    public static void main(String[] args) throws CloneNotSupportedException{
        Student S1 = new Student("Mubariz", 35);
        Student S2 = (Student)S1.clone();


        System.out.println(S1.name + " - " + S1.age);
                System.out.println(S2.name + " - " + S2.age);


    }


}



class Student implements Cloneable{
    String name;
    int age;

    Student(String name, int age){
        this.name=name;
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}