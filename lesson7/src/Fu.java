public class Fu {
    public static void main(String[] args) {
        System.out.println(getSum(5, 6));
        System.out.println(getSum(143, 25));
        System.out.println(getAverage(3,6));
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
}
