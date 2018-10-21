public class SortingChoice {
    public static void main(String[] args) {
        int[] array = {5, 35, 1, 97, 103, 17, 42};
        System.out.println(getMaxIndex(array));
    }

    private static int getMaxIndex(int[] array) {
        int max = array[0];
        int index = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (max > array[i+1]) {
                max = array[i+1];
            }
        }
        return max;
    }
}
