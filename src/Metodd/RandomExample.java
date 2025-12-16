package Metodd;

import java.util.Random;

public class RandomExample {
    public static void main(String[] args){

Random random = new Random();

int randomInt = random.nextInt(10); // 10-a qeder tesadufu eded 10 daxil deyil
        System.out.println("0-9 arası təsadüfi tam ədəd: " + randomInt);

        // 100-a qeder tesadufu eded 100 daxildi
        int randomInt2 = random.nextInt(100) + 1;
        System.out.println("1-100 arası təsadüfi tam ədəd: " + randomInt2);

        // Təsadüfi double (0.0 – 1.0 arası)
        double randomDouble = random.nextDouble();
        System.out.println("0.0 - 1.0 arası təsadüfi double: " + randomDouble);

        boolean randomBoolean = random.nextBoolean();
        System.out.println("Təsadüfi boolean: " + randomBoolean);

    }



}
