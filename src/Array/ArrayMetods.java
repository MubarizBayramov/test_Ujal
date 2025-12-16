package Array;

import java.util.Arrays;

public class ArrayMetods {
    public static void main(String[] args) {

        int [] a  = {411, 142, 654, 187, 996, 10, 1435, 194, 1589, 8177};
        System.out.println(Arrays.toString(a)); // tostring metodu


        Arrays.sort(a);
        System.out.println(Arrays.toString(a)); // sotlasdirir



int index = Arrays.binarySearch( a, 142); // indeksini tapir
        System.out.println("5 elementinin indeksi: " + index);




        int [] d = {1, 2, 45, 12, 31, 78};
        int [] b = {11, 12, 455, 172, 314, 788};
        System.out.println(Arrays.equals(d, b)); // false


        int [] arr = new int[11];
        Arrays.fill(arr, 5); // 11 elementin hamisinin 5 ile doldurur
        System.out.println(Arrays.toString(arr));



        int [] numbers = {14, 25, 475, 182, 319, 785, 145, 255, 4745, 1832, 3719, 7885};
        int [] copy1 = Arrays.copyOf(numbers, 4); // ilk 4 elementi kopyaladi
        System.out.println(Arrays.toString(copy1));


        int [] num = {14, 25, 475, 182, 319, 785, 145, 255, 4745, 1832, 3719, 7885};
        int [] copy2 = Arrays.copyOfRange(num, 1,6); //1-den 6-a qeder elementleri kopyalayir
        System.out.println(Arrays.toString(copy2));



        int [][]  matrix = {{1,2}, {3,4}}; // matrix massivi oxunaqli hala saliriq
        System.out.println(Arrays.deepToString(matrix));



    }

}