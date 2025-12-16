package Metodd;

import java.math.BigDecimal;   // Dəqiq onluq ədədlər ucun


public class BigDecimalExample {
    public static void main(String[] args) {
        BigDecimal b1 = new BigDecimal("25.45");
        BigDecimal b2 = new BigDecimal("2563.52");

        BigDecimal sum = b1.add(b2);
        System.out.println(sum);
    }
}
