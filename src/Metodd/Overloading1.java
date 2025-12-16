package Metodd;

public class Overloading1 {


    public static void parametr(){ // parametrsiz
        System.out.println("parametrsiz");
    }


    public static void  parametr (String name){ //birParametrli
        System.out.println("Salam " + name);
    }


    public static void parametr  (String name, int age){ // ikiParametrli
        System.out.println("Salam " + name + ", yasi " + age);
    }




    public static void main(String[] args) {
        parametr();
        parametr("Mubariz");
        parametr("Mubariz", 45);
    }



}
