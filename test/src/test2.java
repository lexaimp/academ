//import 2
import java.util.Arrays;

public class test2 {
    public static void main(String[] args) {
        int[] array = {10, 2, 3, 6, 8, 7, 1, 12};
        System.out.println(Arrays.toString(array));

        heapSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void heapCreate(int[] array, int length, int parent) {
        int maxChild;
        while (2 * parent + 1 <= length - 1) {
            int child1 = 2 * parent + 1;
            int child2 = 2 * parent + 2;

            if (child1 == length - 1) {
                maxChild = child1;
            } else if (array[child1] > array[child2]) {
                maxChild = child1;
            } else {
                maxChild = child2;
            }
            if (array[parent] < array[maxChild]) {
                int temp = array[parent];
                array[parent] = array[maxChild];
                array[maxChild] = temp;
                parent = maxChild;
            } else {
                break;
            }
        }
    }

    private static void heapSort(int[] array) {
        int n = array.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapCreate(array, n, i);
        }
        for (int i = n - 1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            heapCreate(array, i, 0);
        }
    }
}
