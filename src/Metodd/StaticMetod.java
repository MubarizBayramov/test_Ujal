package Metodd;

public class StaticMetod {
    int age = 25; // non-static

    // Static metod
    public static void staticMethod() {
        System.out.println("Static metodu işləyir");
    }

    // main metodu class daxilində olmalıdır
    public static void main(String[] args) {
        // Static metodu birbaşa çağıra bilərik
        staticMethod();

        // Non-static dəyişənə çatmaq üçün obyekt yaratmalıyıq
        StaticMetod obj = new StaticMetod();
        System.out.println("Non-static age = " + obj.age);
    }
}
