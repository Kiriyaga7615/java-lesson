package app;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new Random().ints(10, 1, 101).toArray(); // Масив з 10 випадкових чисел від 1 до 100

        System.out.println("Original Array: " + Arrays.toString(array));

        ArrayUtils.mergeSort(array);
        System.out.println("Sorted Array: " + Arrays.toString(array));

        int target = array[new Random().nextInt(array.length)];
        System.out.println("Target Value: " + target);

        int index = ArrayUtils.binarySearch(array, target);

        if (index != -1) {
            System.out.println("Target found at index: " + index);
        } else {
            System.out.println("Target not found.");
        }
    }
}
