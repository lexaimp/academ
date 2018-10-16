// import
public class AverageOfArray {
    public static void main(String[] args) {
        int[] array = {8, 2, 6, 1, 9, 16};
        System.out.println(getAverageEvenNumberOfArray(array));
    }

    private static double getAverageEvenNumberOfArray(int[] array) {
        int sum = 0;
        int count = 0;
        for (int e : array) {
            if (e % 2 == 0) {
                sum += e;
                count++;
            }
        }
        return (double) sum / count;
    }
}
