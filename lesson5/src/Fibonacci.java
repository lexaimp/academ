// посмореть доделать
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите n");
        int n = scanner.nextInt();
        int i = 0;
        int fib = 1;
        int a = 1;
        int b = 1;
        while (i++ < n) {
            System.out.print(fib + " ");
            a = b;
            b = fib;
            fib = a + b;
        }
        System.out.println("Число Фибоначчи " + fib);
    }
}
