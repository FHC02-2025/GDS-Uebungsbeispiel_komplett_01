package arrays;

import java.util.Arrays;

public class NumberHelper {

    public static void main(String[] args) {
        int[] numbers = {1, 5, 3, 1, 9, 2, 5, 5};
        int[] numbersSorted = {1,2,3,4};

        System.out.println(isSortedArray2(numbersSorted));
        System.out.println(isSortedArray2(numbers));

        System.out.println(Arrays.toString(removeDuplicates(numbers)));

        System.out.println(Arrays.toString(removeDuplicates(numbersSorted)));
    }

    public static boolean isSortedArray(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSortedArray2(int[] numbers) {
        for (int i = 0, j = 1; j < numbers.length; i++,j++) {
            if (numbers[i] > numbers[j]) {
                return false;
            }
        }
        return true;
    }

    public static int[] removeDuplicates(int[] numbers) {
        for (int i = 0; i < numbers.length -1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    numbers[j] = -1;
                }
            }
        }
        return numbers;
    }
}
