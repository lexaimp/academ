public class Average {
    public static void main(String[] args) {
//        todo дорешать
        int i = 0;
        int initialValue = 3;
        int finalValue = 6;
        int count = finalValue - initialValue;
        while (i <= count) {
            initialValue += i;
            ++i;
        }
        System.out.println(initialValue);
        finalValue += 1;
        System.out.println(finalValue);
    }
}
