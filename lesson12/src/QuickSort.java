import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {5, 35, 1, 6, 97, 103, 17, 634, 42, 9};
        System.out.println(Arrays.toString(array));
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    private static void quickSort(int[] a, int left, int right) {
        int x = (a.length - 1) / 2;
        m1:
        for (int i = left; left < right; i++) {
            if (a[i] >= a[x]) {
                for (int j = right; right > left; j--) {
                    if (a[j] <= x) {
                        if (a[i] <= a[j]) {
                            int temp = a[i];
                            a[i] = a[j];
                            a[j] = temp;
                            i++;
                            j++;
                        } else {
                            break m1;
                        }
                    }
                }
            }
        }
    }
}
