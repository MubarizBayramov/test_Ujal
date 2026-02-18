package GenericCollections;

import java.util.ArrayList;
import java.util.Arrays;

public class Generics1 {
    public static void main(String[] args){

        ArrayList <String> list = new ArrayList<>();
        list.add("Mubariz");
        list.add("Ay");

                for(String a : list){
            System.out.println(a);
        }



        ArrayList<String> newString = new ArrayList<>();
        newString.add("Yeni String");

        for(String b: newString){
            System.out.println(b);
        }

    }
}
