//import

import java.util.Scanner;

public class DigitsNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        int sum = 0;
        int sum1;
        int sumOdd = 0;
        int max = 0;

        while (number != 0) {
            sum += number % 10;
            sum1 = number % 10;
            if (max < sum1) {
                max = sum1;
            }
            if (sum1 % 2 != 0) {
                sumOdd += sum1;
            }
            number /= 10;
        }
        System.out.println("Сумма цифр чила: " + sum);
        System.out.println("Cумма нечётных цифр числа: " + sumOdd);
        System.out.println("Максимальная цифра числа: " + max);
    }

}
