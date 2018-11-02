//Пирамидальная сортировка - надо без рекурсии

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        int[] array = {1, 10, 25, 7, 8, 17, 5, 14};
        for (int anArray : array) System.out.printf("%d ", anArray);

        for (int i = (array.length / 2) - 1; i >= 0; i--)
            siftDown(array, i, array.length - 1);
        System.out.println();
        for (int anArray : array) System.out.printf("%d ", anArray);

        for (int i = array.length - 1; i >= 1; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            siftDown(array, 0, i - 1);
        }
        System.out.println();
        for (int anArray : array) System.out.printf("%d ", anArray);
    }

    private static void siftDown(int[] numbers, int root, int bottom) {
        int maxChild;
        while ((root * 2 <= bottom)) {
            if (root * 2 == bottom)
                maxChild = root * 2;
            else if (numbers[root * 2] > numbers[root * 2 + 1])
                maxChild = root * 2;
            else
                maxChild = root * 2 + 1;
            if (numbers[root] < numbers[maxChild]) {
                int temp = numbers[root];
                numbers[root] = numbers[maxChild];
                numbers[maxChild] = temp;
                root = maxChild;
            } else break;
        }
    }
}