package Metodd;

public class TryTry {
    public static void main(String[] args){


            try { // Xarici try
                int[] a = {1, 2, 3, 4};
                System.out.println(a[0]);


                try { // Daxili try
                    int result = a[2] / 0; // Sıfıra bölmə
                    System.out.println(result);


            } catch (ArithmeticException e) {

                System.out.println("Daxili try: Sıfıra bölmə xətası!");
            }



            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Xarici try: Massivdə belə indeks yoxdur!");
            }


            System.out.println("Proqram davam edir...");

}
}


