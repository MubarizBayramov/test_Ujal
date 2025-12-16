package Metodd;

import java.math.BigInteger;

public class BigIntegerExample {
    public static void main(String[] args) {
        BigInteger b1 = new BigInteger("2563256564548556565665632563569844444545678765434567876543654");
        BigInteger b2 = new BigInteger("25632552455245656525565653652655265345456456787654398444445654");

        BigInteger sum = b1.add(b2);
        System.out.println(sum);
    }
}
