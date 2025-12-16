import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serilizasion {
    public static void main(String[] args) {
        try {
            Student s = new Student("Mubariz", 37);

            // Fayl axını yaradılır
            FileOutputStream fileOut = new FileOutputStream("student.ser");

            // Obyekt axını yaradılır
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            // Obyekt seriyalaşdırılır
            out.writeObject(s);

            out.close();
            fileOut.close();

            System.out.println("Obyekt seriyalaşdırıldı");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// Student sinfi serializable olmalıdır
class Student implements Serializable {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
