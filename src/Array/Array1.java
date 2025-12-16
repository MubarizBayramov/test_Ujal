package Array;

import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {


    int[] array =  {1, 3, 5, 6, 8};
    for (int i =0; i<array.length; i++ ){

        System.out.println("Element " + i + " = " + array[i]);
    }

}}


class ForeachArray{
    public static void main(String[] args){

        String [] adlar = {"Mubariz", "Ayxan", "Nubar", "Ali"};
        for(String ad: adlar){
            System.out.println("Salam, " + ad);



        }
    }
}

class emeliyyatlar{
    public static void main(String[] args) {
        int[] number = new int[5];
        number[0] = 10;
        number[1] = 11;
        number[2] = 20;
        number[3] = 170;
        number[4] = 100;
        System.out.println(number[3]);
        System.out.println(number[0]);
        System.out.println(number[4]);


        int[] arr = {10, 20, 30, 40};
        System.out.println("Massivin ölçüsü: " + arr.length);



int [] reqemler = {11, 54, 20, 45, 1004, 801, 97, 104};
int max = reqemler[0];
int min = reqemler [0];
 for(int n : reqemler){
     if(n > max) max = n;
     if(n< min) min = n;
     System.out.println();
 }
        System.out.println("Ən böyük: " + max);
        System.out.println("Ən kiçik: " + min);




        int [] sortlama = { 12, 45, 75, 88 , 74 , 32, 11, 77};
        Arrays.sort(sortlama);
        System.out.println(Arrays.toString(sortlama));



        int [] a = {11, 54, 20, 45, 1004, 801, 97, 104};
        int[] b = Arrays.copyOf(a, a.length);
        System.out.println(Arrays.toString(b));
    }

}