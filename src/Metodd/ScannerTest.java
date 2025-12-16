package Metodd;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);


        System.out.println("Adinizi yazin");
        System.out.println("Yasinizi qeyd edin");
        int yas = scanner.nextInt();
        String ad = scanner.nextLine();

        System.out.println(String.format("Salam, %s! Siz %d yaşındasınız.", ad, yas));

        scanner.close();

    }
}
