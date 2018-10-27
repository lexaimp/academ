// import

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {5, 35, 42, 2, 10, 103, 17, 634, 1, 9};
        System.out.println(Arrays.toString(array));

        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    private static void quickSort(int[] a, int left, int right) {
        if (right - left == 0) {
            return;
        }
        if (right - left == 1) {
            if (a[left] > a[right]) {
                int temp = a[left];
                a[left] = a[right];
                a[right] = temp;
            }
            return;
        }
        int x = a[(left + right) / 2];
        int i = left;
        int j = right;

        while (i <= j) {
            while (a[i] < x) {
                i++;
            }
            while (a[j] > x) {
                j--;
            }
            if (i <= j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }
        if (i < right) {
            quickSort(a, i, right);
        }
        if (j > left) {
            quickSort(a, left, j);
        }
    }
}
