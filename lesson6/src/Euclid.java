// import2

public class Euclid {
    public static void main(String[] args) {
        System.out.println(getMinCommonDivider(45, 165));
    }

    private static int getMinCommonDivider(int a, int b) {
        while (a != 0 && b != 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        return a + b;
    }
}