public class Sum {
    public static void main(String[] args) {
        int i = 3;
        int sum1 = 0;
        int sum2 = 0;

        while (i <= 21) {
            if (i % 2 == 0) {
                sum1 += i;
            }
            sum2 += i;
            ++i;
        }
        System.out.println(sum1);
        System.out.println(sum2);
    }
}