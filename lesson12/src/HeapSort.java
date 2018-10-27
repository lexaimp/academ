import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] array = {10, 2, 3, 6, 8, 7, 1, 12};
        System.out.println(Arrays.toString(array));

        heapSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void heapCreate(int[] array, int n) {
        int child1 = 2 * n + 1;
        int child2 = 2 * n + 2;
        int parent = n;

        if (child1 <= array.length - 1 && array[child1] > array[parent]) {
            parent = child1;
        }
        if (child2 <= array.length - 1 && array[child2] > array[parent]) {
            parent = child2;
        }
        if (parent != n) {
            int temp = array[n];
            array[n] = array[parent];
            array[parent] = temp;
            heapCreate(array, parent);
        }
    }

    private static void buildHeap(int[] array) {
        int n = array.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapCreate(array, i);
        }
    }

    private static void heapSort(int[] array) {
        buildHeap(array);
        int n = array.length - 1;
        for (int i = n; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            n--;
            heapCreate(array, 0);
        }
    }
}
