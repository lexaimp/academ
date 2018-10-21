// import
public class Exponentiation {
    public static void main(String[] args) {
        System.out.println(getExponentiation(5, 6));
        System.out.println(getExponentiation2(5, 4));
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
        int degreeOf = a;
        for (int i = 1; i < b; i++) {
            degreeOf *= a;
        }
        return degreeOf;
    }
}
