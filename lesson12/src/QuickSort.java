import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {5, 35, 42, 2, 6, 103, 17, 634, 1, 9};
        System.out.println(Arrays.toString(array));
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    private static void quickSort(int[] a, int left, int right) {
        if (left == right){
            return;
        }
        int x = (a.length - 1) / 2;
        for (int i = left; i < right; i++) {
            if (a[i] >= a[x]) {
                for (int j = right; j > left; j--) {
                    if (a[j] <= a[x]) {
                        if (a[i] <= a[j]) {
                            int temp = a[i];
                            a[i] = a[j];
                            a[j] = temp;
                        } else {
                            i++;
                            j++;
                        }
                    }
                }
            }
        }
    }
}
