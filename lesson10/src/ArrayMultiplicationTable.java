// import
public class ArrayMultiplicationTable {
    public static void main(String[] args) {
        int[][] multiplicationTable = getArrayMultiplicationTable(6);

        for (int[] e : multiplicationTable) {
            System.out.println();
            for (int k : e) {
                System.out.printf("%4d", k);
            }
        }
    }

    private static int[][] getArrayMultiplicationTable(int size) {
        int[][] array = new int[size][size];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (i + 1) * (j + 1);
            }
        }
        return array;
    }
}
