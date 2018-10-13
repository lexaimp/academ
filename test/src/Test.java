import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int length = 5;
        int height = 5;
        int[][] array = new int[length][height];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < height; j++) {
                array[i][j] = j;
            }
        }
        System.out.println(array[0][4]);
    }
}
