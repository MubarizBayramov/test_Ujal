import java.util.Scanner;

public class UnicodeFinderInteractive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hərfi daxil et: ");
        String input = scanner.nextLine();


        if (input.length() != 1) {
            System.out.println("Zəhmət olmasa yalnız bir hərf daxil edin!");
            return;
        }

        char letter = input.charAt(0);  // Simvolu götür
        int decimalCode = (int) letter; // Decimal Unicode
        String hexCode = String.format("\\u%04X", decimalCode); // Hex format

        System.out.println("Hərf: " + letter);
        System.out.println("Unicode (decimal): " + decimalCode);
        System.out.println("Unicode (hex): " + hexCode);
    }
}
