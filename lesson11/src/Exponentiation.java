// import
public class Exponentiation {
    public static void main(String[] args) {
        System.out.println(getExponentiation(5, 3));
        System.out.println(getExponentiation2(5, 0));
    }

    private static int getExponentiation(int a, int b) {
        if (b > 0) {
            return a * getExponentiation(a, b - 1);
        }
        return 1;
    }

    private static int getExponentiation2(int a, int b) {
        int exponentiation = 1;
        if (b > 0) {
            exponentiation = a;
            for (int i = 1; i < b; i++) {
                exponentiation *= a;
            }
        }
        return exponentiation;
    }
}