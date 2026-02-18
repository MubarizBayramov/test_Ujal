package ArrayListExample;

import java.util.ArrayList;
import java.util.List;

public class ListMassiv {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Go");
        list.add("C++");
        String []array = list.toArray(new String[0]);


    }
}
