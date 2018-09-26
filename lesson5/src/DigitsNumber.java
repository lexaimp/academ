import java.util.Scanner;

public class DigitsNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println(sum);
        int sum1 = 0;
        while (number != 0) {
            if ((number % 10) % 2 != 0) {
                sum1 += number % 10;
                number /= 10;
            }
        }
        System.out.println(sum1);
    }

}
