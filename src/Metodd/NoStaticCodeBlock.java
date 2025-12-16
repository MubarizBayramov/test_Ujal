package Metodd;

public class NoStaticCodeBlock {
    int age;
String name;

    {
        System.out.println("Static olmayan kod");
    }




    public static void main(String[] args){

        System.out.println("static kod bloku");
    }
}
