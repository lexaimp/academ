public class Euclid2 {
    public static void main(String[] args) {
        System.out.println(getGcd(45, 165));
    }

    private static int getGcd(int a, int b) {
        int gcd = 0;
        if (b > a){
            int temp = a;
            a = b;
            b = temp;
        }
        if (a % b == 0) {
            gcd = b;
        }
        while (a % b != 0) {
            gcd = a % b;
            a = b;
            b = gcd;
        }
        return gcd;
    }
}
