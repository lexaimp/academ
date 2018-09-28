public class Average {
    public static void main(String[] args) {
        int initialValue = 3;
        int finalValue = 6;
        int i = initialValue;
        int count1 = 0;
        int count2 = 0;
        int sum1 = 0;
        int sum2 = 0;

        while (i <= finalValue) {
            if (i % 2 == 0) {
                sum1 += i;
                ++count2;
            }
            sum2 += i;
            ++i;
            ++count1;
        }
        System.out.println(sum1 / count2);
        System.out.println(sum2 / count1);
    }
}