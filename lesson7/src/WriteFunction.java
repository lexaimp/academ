public class WriteFunction {
    public static void main(String[] args) {
        System.out.println(getSum(5, 6));
        System.out.println(getSum(143, 25));
        System.out.println(getAverage(3, 6));
        System.out.println(getMax(12.65, 45.234));
        System.out.println(getMin(12.65, 45.234));
    }

    private static double getSum(double x, double y) {
        return 3 * x + 4 * y;
    }

    private static double getAverage(int initialValue, int finalValue) {
        int sum = 0;
        int count = 0;
        for (int i = initialValue; i <= finalValue; i++) {
            sum += i;
            count++;
        }
        return (double) sum / count;
    }

    private static double getMax(double x, double y) {
        double epsilon = 1.0e-10;
        return (x - y > epsilon) ? x : y;
    }

    private static double getMin(double x, double y) {
        double epsilon = 1.0e-10;
        return (x - y < epsilon) ? x : y;
    }
}
