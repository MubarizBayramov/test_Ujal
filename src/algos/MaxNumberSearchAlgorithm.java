package algos;

public class MaxNumberSearchAlgorithm implements SearchAlgorithm {

    @Override
    public void search(int[] numbers) {
        int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }

            if (numbers[i] < min) {
                min = numbers[i];

            }

              }

        System.out.println("Max number is: " + max);
        System.out.println("Min number is: " + min);
}}

