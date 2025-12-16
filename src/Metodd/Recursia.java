package Metodd;

import static Metodd.RecursionExample.factorial;

public class Recursia {
    public static void main(String[] args) {

        int nubmer = 5;
        int result = factorial(nubmer);
        System.out.println(result);


    }

 // elave olaraq 0 ve 1 olduqda factorial dayanir
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }

    }}

