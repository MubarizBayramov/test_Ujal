package Metodd;

import java.util.Arrays;

public class foreachExcample {
    public static void main(String[] args){

        int [] num = {45,1,2,3,4,5,78,55,31,6};
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));

        for (int numbers: num){
        System.out.println(numbers);

    }
}}
