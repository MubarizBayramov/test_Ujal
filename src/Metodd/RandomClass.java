package Metodd;


import java.util.Random;
public class RandomClass {
    public static void main(String[] args){

        Random random = new Random();
        int num  = random.nextInt(100);


        int number2 = random.hashCode();
       System.out.println(num);
        System.out.println(number2);




    }
}
