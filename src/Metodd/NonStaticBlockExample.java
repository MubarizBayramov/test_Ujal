package Metodd;

public class NonStaticBlockExample {

    int a;

    // Non-static kod bloku baslayir. obyekt yaradildigi zaman cagirilir

    {        a = 123;
        System.out.println("Non-static block işləyir!");
    }



    public NonStaticBlockExample(){
        System.out.println("Constructor işləyir");
    }

    public static void main(String[] args) {
        System.out.println("Main metodu işləyir");
        NonStaticBlockExample NS1 = new NonStaticBlockExample();
        NonStaticBlockExample NS2 = new NonStaticBlockExample();

        System.out.println(NS1.a);
        System.out.println(NS2.a);

    }


}
