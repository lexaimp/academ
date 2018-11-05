//done

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] array = {10, 2, 3, 6, 8, 7, 1, 12};
        System.out.println(Arrays.toString(array));

        sortHeap(array);
        System.out.println(Arrays.toString(array));
    }

    private static void createHeap(int[] array, int length, int i) {
        int child1 = 2 * i + 1;
        int child2 = 2 * i + 2;
        int parent = i;

        if (child1 < length && array[child1] > array[parent]) {
            parent = child1;
        }
        if (child2 < length && array[child2] > array[parent]) {
            parent = child2;
        }
        if (parent != i) {
            int temp = array[i];
            array[i] = array[parent];
            array[parent] = temp;
            createHeap(array, length, parent);
        }
    }

    private static void sortHeap(int[] array) {
        int n = array.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            createHeap(array, n, i);
        }
        for (int i = n - 1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            createHeap(array, i, 0);
        }
    }
}
