//Евклид - сейчас неверно

import java.util.Scanner;

public class Euclid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();

        if (b != 0) {
            while (a % b != 0){
                int temp = a;
                a = b;
                b = temp % b;
            }
            System.out.println("НОД = " + b);
        } else if (a != 0){
            System.out.println("НОД = " + a);
        } else {
            System.out.println("НОД не найден!");
        }
    }
}