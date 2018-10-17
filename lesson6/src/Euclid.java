// import

public class Euclid {
    public static void main(String[] args) {
        System.out.println(getEuclid(45, 165));
    }

    private static int getEuclid(int a, int b) {
        if (b != 0) {
            while (a % b != 0) {
                int temp = a;
                a = b;
                b = temp % b;
            }
            return b;
        } else if (a != 0) {
            return a;
        }
        return 0;
    }
}