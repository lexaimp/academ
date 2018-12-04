// import
public class Euclid {
    public static void main(String[] args) {
        System.out.println(getGcd(0, 0));
    }

    private static int getGcd(int a, int b) {
        int gcd = 0;
        if (a != 0 && b != 0) {
            while (a % b != 0) {
                gcd = a % b;
                a = b;
                b = gcd;
            }
        }
        return gcd;
    }
}