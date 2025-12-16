package Metodd;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;
import java.util.Collections;

public class MaxNumber {
    public static void main(String[] args) {
        Integer [] numbers = {25, 78, 85, 2, 1, 5, 7, 8, 9, 11, 58, 65};

    Arrays.sort(numbers);
    Arrays.sort(numbers, Collections.reverseOrder());


    System.out.println("Artan: " + Arrays.toString(numbers));
        System.out.println("Azalan: " + Arrays.toString(numbers));
}
}
