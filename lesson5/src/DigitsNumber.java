//import 2

import java.util.Scanner;

public class DigitsNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        int sum = 0;
        int sumOdd = 0;
        int maxNumeral = 0;

        while (number != 0) {
            sum += number % 10;
            int numeral = number % 10;
            if (maxNumeral < numeral) {
                maxNumeral = numeral;
            }
            if (numeral % 2 != 0) {
                sumOdd += numeral;
            }
            number /= 10;
        }
        System.out.println("Сумма цифр чила: " + sum);
        System.out.println("Cумма нечётных цифр числа: " + sumOdd);
        System.out.println("Максимальная цифра числа: " + maxNumeral);
    }

}
