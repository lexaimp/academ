public class Average {
    public static void main(String[] args) {
        int initialValue = 3;
        int finalValue = 6;
        int i = initialValue;
        int j = 0;
        int k = 0;
        int sum1 = 0;
        int sum2 = 0;

        while (i <= finalValue) {
            if (i % 2 == 0) {
                sum1 += i;
                ++k;
            }
            sum2 += i;
            ++i;
            ++j;
        }
        System.out.println(sum1 / k);
        System.out.println(sum2 / j);
    }
}