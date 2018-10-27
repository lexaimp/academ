//Выбором:
//1. Сейчас не тот алгоритм
//2. Вариант с рекурсией не нужен

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array2 = {45, 84, 58, 7, 357, 1, 68, 1846, 1, 97};
        System.out.println(Arrays.toString(array2));
        selectionSort(array2);
        System.out.println(Arrays.toString(array2));
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
