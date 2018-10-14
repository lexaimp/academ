public class BinarySearch {
    public static void main(String[] args) {

    }

    public static int binarySearch(int[] a, int left, int right, int x) {
        if (left > right) {
            return -1;
        }
        int middle = (right + left) / 2; //… допишите, используя описание алгоритма }
        if (a[middle] == x) {
            return middle;
        } else if (a[left] > x) {

        }
        return -2;
    }
}
