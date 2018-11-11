// import

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {45, 84, 58, 7, 357, 1, 68, 1846, 1, 97};
        System.out.println(Arrays.toString(array));

        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}