package Metodd;

public class recoderExcample {
    public static void main(String[] args){
        Student S = new Student("Mubariz", 45, "bayramovmubariz@gmail.com");
        System.out.println(S);


    }


public record Student (String name, int age, String email) {
}
}
