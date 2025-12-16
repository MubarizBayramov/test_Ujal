package Metodd;

public class ReturnMetod1 {
    public static void yoxla(int a){

        if(a<0){
           System.out.println("Menfi ededdir");
           return;
        }
    }



public static void main(String[] args) {
    yoxla(-5);
    System.out.println("Proqram bitdi.");
}
    }