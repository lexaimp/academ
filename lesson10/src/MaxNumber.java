//import
public class MaxNumber {
    public static void main(String[] args) {
        double[] array = {-15, -153, -3, 0.213412};
        System.out.println(getMaxNumber(array));
    }

    public static double getMaxNumber(double[] array) {
        double epsilon = 1.0e-10;
        double MaxNumber = array[0];
        for (double e : array) {
            if (e - MaxNumber > epsilon) {
                MaxNumber = e;
            }
        }
        return MaxNumber;
    }
}
