//import
public class VerificationSorting {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] array2 = {5, 4, 3, 2, 1};
        System.out.println(isSortingAscending(array));
        System.out.println(isSortingAscending(array2));
        System.out.println(isSortingDescending(array));
        System.out.println(isSortingDescending(array2));
    }

    private static boolean isSortingAscending(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    private static boolean isSortingDescending(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
