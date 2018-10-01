//todo доделать

import java.util.Scanner;

public class Euclid {
    public static void main(String[] args) {
        System.out.println(getEuclidsAlgorithm(5, 6));
    }

    private static int getEuclidsAlgorithm(int a, int b) {
        while (a % b == 0) {
            return a;
        }
        while (b % a == 0) {
            return b;
        }
        return a * b;
    }
}