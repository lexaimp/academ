//Пирамидальная сортировка - надо без рекурсии

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] array = {10, 2, 3, 6, 8, 7, 1, 12};
        System.out.println(Arrays.toString(array));
        buildHeap(array);
        System.out.println(Arrays.toString(array));
    }

    private static void heapIfy(int[] array, int i) {
        int child1 = 2 * i + 1;
        int child2 = 2 * i + 2;
        int parent = i;

        if (child1 < array.length && array[child1] > array[parent]) {
            parent = child1;
        }
        if (child2 < array.length && array[child2] > array[parent]) {
            parent = child2;
        }
        while (parent != i) {
            int temp = array[i];
            array[i] = array[parent];
            array[parent] = temp;
            i = parent;
        }
    }

    private static void buildHeap(int[] array){
        for (int i = array.length / 2 - 1; i >=0; i--){
            heapIfy(array, i);
        }
    }
}