package Metodd;

public class PassByValue1 {
    public static void deyis(int a){
        a =a + 5;
        System.out.println("daxilde " + a);

    }

    public static void main(String[] args) {
        int say = 10;
        System.out.println("Əvvəl say: " + say);
        deyis(say);
        System.out.println("Metoddan sonra say: " + say); // əsli dəyişmir
    }

}
