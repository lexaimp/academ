// done
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите n");
        int n = scanner.nextInt();
        int i = 0;
        int sum = 0;
        int fib1 = 0;
        int fib2 = 1;

        while (i <= n) {
            sum += fib1;
            fib1 = fib2;
            fib2 = sum;
            ++i;
        }
        System.out.println(sum);
    }
}
