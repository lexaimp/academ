// todo разобраться с выводом нескольких индексов.
public class SearchElement {
    public static void main(String[] args) {
        double[] array = {23, 5, 1234, 12.6, 5, 854, 6};
        System.out.println(getIndex(array, 5));
    }

    private static int getIndex(double[] array, double number) {
        double epsilon = 1.0e-10;
        for (int i = 0; i < array.length; i++) {
            if (Math.abs(number - array[i]) <= epsilon) {
                return i;
            }
        }
        return -1;
    }
}
