//import

import java.util.Arrays;

public class TurnArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        double[] array2 = {25.3, 78854.654, -847.214, 5746.6547864,};
        String[] array3 = {"давайте", "жить", "дружно"};
        TurnArray(array);
        TurnArray(array2);
        TurnArray(array3);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));
    }

    private static void TurnArray(int[] array) {
        int middleOfArray = array.length / 2;
        for (int i = 0; i < middleOfArray; i++) {
            array[i] = array[array.length - 1 - i] - array[i];
            array[array.length - 1 - i] -= array[i];
            array[i] += array[array.length - 1 - i];
        }
    }

    private static void TurnArray(double[] array) {
        int middleOfArray = array.length / 2;
        for (int i = 0; i < middleOfArray; i++) {
            double a = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = a;
        }
    }

    private static void TurnArray(String[] array) {
        int middleOfArray = array.length / 2;
        for (int i = 0; i < middleOfArray; i++) {
            String a = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = a;
        }
    }
}
