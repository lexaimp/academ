// import

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {5, 35, 1, 6, 97, 103, 17, 634, 42, 9};
        System.out.println(Arrays.toString(array));
        selectionSortRecursion(array, 0);
        System.out.println(Arrays.toString(array));

        int[] array2 = {45, 84, 58, 7, 357, 1, 68, 1846, 1, 97};
        System.out.println(Arrays.toString(array2));
        selectionSort(array2);
        System.out.println(Arrays.toString(array2));
    }

    private static void selectionSortRecursion(int[] array, int start) {
        if (start == array.length - 1) {
            return;
        }
        for (int i = start; i < array.length - 1; i++) {
            if (array[start] > array[i + 1]) {
                int temp = array[start];
                array[start] = array[i + 1];
                array[i + 1] = temp;
            }
        }
        start++;
        selectionSortRecursion(array, start);
    }

    private static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i; j < array.length - 1; j++) {
                if (array[i] > array[j + 1]) {
                    int temp = array[i];
                    array[i] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
