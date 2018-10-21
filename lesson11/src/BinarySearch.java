// import

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 18, 35, 71, 186};
        System.out.println(binarySearch(array, 186));
        System.out.println(binarySearchRecursion(array, 0, array.length - 1, 3));
    }

    private static int binarySearch(int[] a, int x) {
        int left = 0;
        int right = a.length - 1;
        while (left <= right) {
            int middle = (right + left) / 2;
            if (a[middle] == x) {
                return middle;
            } else if (x > a[middle]) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }

    private static int binarySearchRecursion(int[] a, int left, int right, int x) {
        if (left > right) {
            return -1;
        }
        int middle = (right + left) / 2;
        if (a[middle] == x) {
            return middle;
        } else if (x > a[middle]) {
            return binarySearchRecursion(a, middle + 1, right, x);
        } else {
            return binarySearchRecursion(a, left, middle - 1, x);
        }
    }
}
