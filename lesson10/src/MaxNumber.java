public class MaxNumber {
    public static void main(String[] args) {
        double[] array = {-15, -153, -3};
        System.out.println(getMaxNumber(array));
    }

    public static double getMaxNumber(double[] array) {
        double MaxNumber = array[0];
        for (double e : array) {
            if (MaxNumber < e) {
                MaxNumber = e;
            }
        }
        return MaxNumber;
    }
}
