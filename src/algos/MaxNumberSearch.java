package algos;
import java.util.Arrays;
import java.util.Collections;

public class MaxNumberSearch {
    public static void main(String[] args) {
        int[] numbers = {41,9,4,76,100,32,74,3,15,85,93,11,7,55};

        MaxNumberSearchAlgorithm maxSearch = new MaxNumberSearchAlgorithm();
        maxSearch.search(numbers);

        Arrays.sort(numbers);
        System.out.println("Artan sıra ilə: " + Arrays.toString(numbers));




    }
}

