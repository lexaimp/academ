//import
public class ArrayMultiplicationTable {
    public static void main(String[] args) {
        int multiplicationTable[][] = getArrayMultiplicationTable(5);

        for (int i = 0; i < multiplicationTable.length; i++) {
                System.out.println();
            for (int j = 0; j < multiplicationTable.length; j++) {
                System.out.printf("%4d", multiplicationTable[i][j]);
            }
        }
    }

    private static int[][] getArrayMultiplicationTable(int size) {
        int[][] array = new int[size][];
        for (int i = 0; i < array.length; i++) {
            array[i] = new int[size];
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (i + 1) * (j + 1);
            }
        }
        return array;
    }
}
