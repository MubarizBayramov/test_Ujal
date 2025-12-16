package Metodd;

import java.util.Scanner;

public class ScannerInputExcample {
    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);


    System.out.println("Nomre daxil et");
    int number = scanner.nextInt();
    System.out.println("daxil etdiyiniz eded: " +number );


        System.out.println("onluq eded daxil et");
        double decimal = scanner.nextDouble();
        System.out.println("daxil etdiyiniz onluq eded: " + decimal );
}

}
