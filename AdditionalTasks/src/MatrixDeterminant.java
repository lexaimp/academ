
public class MatrixDeterminant {
    public static void main(String[] args) {
        int[][] matrix = getMatrix(3, 3);
        printMatrix(matrix);
        System.out.println(getMatrixDeterminant(matrix));
    }

    private static int[][] getMatrix(int matrixWidth, int matrixHeight) {
        int[][] matrix = new int[matrixWidth][matrixHeight];
        for (int i = 0; i < matrixWidth; i++) {
            for (int j = 0; j < matrixHeight; j++) {
                matrix[i][j] = (int) (Math.random() * 30);
            }
        }
        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%3d", matrix[i][j]);
            }
            System.out.println();
        }
    }

    private static int getMatrixDeterminant(int[][] matrix) {
        int determinant = 0;
        if (matrix.length == 2) {
            return (matrix[0][0] * matrix[1][1]) - (matrix[1][0] * matrix[0][1]);
        }
        if (matrix.length == 3) {
            for (int k = 0; k < 3; k++) {
                for (int j = 0; j < 2; j++) {
                    System.out.println(matrix[k][j + 1]);
                }
                System.out.println();
            }
        }
        return determinant;
    }
}