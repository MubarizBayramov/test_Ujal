package GenericCollections;

import java.util.List;
import java.util.stream.Collectors;

public class StreamAPi1 {
    public static void main(String [] args){
    List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

List<Integer> result = numbers.stream()
        .map(n -> n * 2)
        .collect(Collectors.toList());
System.out.println(result);



    }
}
