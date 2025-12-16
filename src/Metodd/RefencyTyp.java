package Metodd;

public class RefencyTyp {


        String name;
        Integer age = 15;
        int count = 70;

        static RefencyTyp RT = new RefencyTyp();
    public static void main(String[] args){
        System.out.println(RT.name); // null verecek. teyin edilmeyib
        System.out.println(RT.age); // null deyil
        System.out.println(RT.count); // null deyil



    }
}
