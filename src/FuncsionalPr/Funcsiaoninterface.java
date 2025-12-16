package FuncsionalPr;

public class Funcsiaoninterface {
   public static void main(String[] args){
cal addition  = (a, b) -> a + b;
       cal subtraction = (a, b) -> a - b;

       System.out.println("10 + 5 = " + addition.operator(10,5));
System.out.println("10 - 5 = " + subtraction.operator(10, 5) );
   }


}


interface cal{
    int operator (int a, int b); // bir metodu var
}