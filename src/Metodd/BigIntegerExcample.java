package Metodd;


import java.math.BigInteger;

public class BigIntegerExcample {

public static void main(String[] args){

    BigInteger a = new BigInteger("123456789012345678901234567890");
    BigInteger b = new BigInteger("987654321098765432109876543210");

    BigInteger sum  = a.add(b); // toplama
System.out.println(sum);

}


}
