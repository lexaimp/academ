// import
public class Exponentiation {
    public static void main(String[] args) {
        System.out.println(getExponentiation(5, 6));
        System.out.println(getExponentiation2(5, 2));
    }

    private static int getExponentiation(int a, int b) {
        if (b == 0) {
            return 1;
        }
        return a * getExponentiation(a, b - 1);
    }

    private static int getExponentiation2(int a, int b) {
        if (b == 0) {
            return 1;
            }
        for (int i = 1; i < b; i++) {
            a *= a;
        }
        return a;
    }
}
