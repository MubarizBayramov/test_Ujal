package ExceptionHandlerExample;

public class ExceptionExample {
    public static void main(String[] args){
        try {
        int a = 5;
        int b = 0;
        int c = a/b;
        System.out.println("Netice "+ c);
        } catch (ArithmeticException e) {
            System.out.println("Arifmetik xeta" + e.getMessage());
        } finally {
            System.out.println("Bu hisse ne olursa olsun isleyecek");

        }
System.out.println("Proqram davam edir");
    }
}
