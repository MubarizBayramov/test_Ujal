package Metodd;

public class Metod {
    public static int toplama(int a, int b) { // parametrli
        return a + b;
    }

    public static void sayHello() { // parametrsiz
        System.out.println("Salam, Java!");
    }

    public static void helloName(String name) {  // bir parametrli
                System.out.println("Salam "  +name);
    }


    public static void main(String[] args) { // main metodu Əsas metod

int netice = toplama(5,3);   // arqumentli 5 və 3
System.out.println(netice);
        sayHello(); // parametrsiz
        helloName("Mubariz");
        helloName("Orxan");
        helloName("Nane");





    }
}
