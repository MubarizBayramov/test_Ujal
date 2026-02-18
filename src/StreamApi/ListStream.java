package StreamApi;

import java.util.List;

public class ListStream {
    public static void main(String[] args){
    List<String> siyahi = List.of("Bir","Iki", "Uc", "Dord");
        siyahi.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6); // diger list
        numbers.stream()  // strem yaradir
                .filter(n->n%2==0) // ikiye bolunenleri
          .forEach(System.out::println); // cap edir


        List<String> yeniSiyahi = List.of("yeniler", "Bir daha yeniler", "Daha bir yeni");
        yeniSiyahi.stream()
                .forEach(System.out::println);
}
}


