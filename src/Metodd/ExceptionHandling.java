package Metodd;

public class ExceptionHandling {
    public static void main(String[] args){

     try {
        int a = 3;
         int b = 0;
         int c = a / b;
         System.out.println(c);
     } catch (ArithmeticException e) {
         System.out.println("Xəta baş verdi: " + e.getMessage());
     } finally {
         System.out.println("Bura hemise isleyecek");
     }

}
}