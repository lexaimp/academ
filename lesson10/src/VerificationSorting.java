// done
public class VerificationSorting {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] array2 = {5, 4, 3, 2, 1};
        System.out.println(isSortedAscending(array));
        System.out.println(isSortedAscending(array2));
        System.out.println(isSortedDescending(array));
        System.out.println(isSortedDescending(array2));
    }

    private static boolean isSortedAscending(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    private static boolean isSortedDescending(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
