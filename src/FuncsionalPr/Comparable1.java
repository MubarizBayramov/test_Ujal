package FuncsionalPr;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Comparable1 {
    public static void main(String[] args){
        List<Student> students = new ArrayList<>();

        students.add(new Student("Nuray", 20));
        students.add(new Student("Aga", 22));
        students.add(new Student("Nayy", 19));
        students.add(new Student("Yurt", 25));
        students.add(new Student("Misa", 21));

        Collections.sort(students);
        System.out.println(students);



    }
}



class Student implements Comparable<Student> {
    String name;
    int age;

    public Student (String name, int age){
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString(){
        return name + " (" + age + ")";
    }



}