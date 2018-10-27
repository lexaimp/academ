// done

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {5, 35, 1, 6, 97, 103, 17, 634, 42, 9};
        System.out.println(Arrays.toString(array));
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (temp >= array[j]) {
                    break;
                }
                array[j + 1] = array[j];
            }
            array[j + 1] = temp;
        }
    }
}
