package Metodd;

public class PasByValueExample {
    public static void main(String[] args){

        void pass(int a){
            int a = 5;

        }
        int x = 6;
        pass(a);
        System.out.println(a);
    }
}
