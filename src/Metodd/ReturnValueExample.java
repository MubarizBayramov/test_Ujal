package Metodd;

public class ReturnValueExample {
    public static int toplama(int a, int b) {
        int c = a+b;
        return c;
    }

    public static void main(String[] args) {
        int netice = toplama(5, 7);
        System.out.println(netice);
    }}