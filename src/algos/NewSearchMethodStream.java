package algos;

import java.util.Arrays;

public class NewSearchMethodStream {
    public static void main(String[] args) {

        int[] numbers = {41, 9, 4, 76, 100, 32, 74, 3, 9,87, 705, 78};

        int max = Arrays.stream(numbers).max().getAsInt();
        int min = Arrays.stream(numbers).min().getAsInt();

        System.out.println("Max number is: " + max);
        System.out.println("Min number is: " + min);
    }}