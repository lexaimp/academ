// done
public class MaxNumber {
    public static void main(String[] args) {
        double[] array = {-15, -153, -3, 0.213412};
        System.out.println(getMaxNumber(array));
    }

    private static double getMaxNumber(double[] array) {
        double maxNumber = array[0];
        for (double e : array) {
            if (e > maxNumber) {
                maxNumber = e;
            }
        }
        return maxNumber;
    }
}
