//Евклид - сейчас неверно

public class Euclid {
    public static void main(String[] args) {
        System.out.println(getEuclidsAlgorithm(3, 6));
    }

    private static int getEuclidsAlgorithm(int a, int b) {
        while (a != 0 && b != 0) {
            if (a % b == 0) {
                return a;
            } else if (b % a == 0) {
                return b;
            } else {
                return a * b;
            }
        }
        return a;
    }
}