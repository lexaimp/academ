import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {5, 1, 35, 6, 97, 103, 17, 634, 42, 9};
        System.out.println(Arrays.toString(array));
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void insertionSort(int[] array) {
        for (int i = 1; i < array.length - 1; i++) {
            for (int j = 0; j < i; j++) {
                int temp = array[i];
                if (temp < array[j]){
                    array[i] = array[j];
                }
            }
        }
    }
}
