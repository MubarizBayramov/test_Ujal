package ArrayListExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args){


    String[] array = {"Java","pyhton", "C++"};
    List<String> list = Arrays.asList(array);

        ArrayList<String> listDeyiseBilir = new ArrayList<>(Arrays.asList(array)); // massivden liste cevrilir. listi deyismek olmur
        listDeyiseBilir.add("Burada listi deyismek mumkundur"); // massivden liste cevrilir. listi deyismek olur


        System.out.println(list);
    System.out.println(listDeyiseBilir);
}
}