package exceptionHandler;

public class TryCatchFinally {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Xeta");
        } finally {
            System.out.println("Bu blok həmişə işləyir.");
        }
        System.out.println("Proqram davam edir...");
    }

}

