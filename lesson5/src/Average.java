public class Average {
    public static void main(String[] args) {
//        todo дорешать
        int initialValue = 3;
        int finalValue = 6;
        for (int i = 0; i <= finalValue - initialValue; i++) {
            initialValue += initialValue + 1;
            System.out.println(initialValue);
        }
    }
}