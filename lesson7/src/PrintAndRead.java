import java.util.Scanner;

public class PrintAndRead {
    public static void main(String[] args) {
        int a = printAndRead("Введите число:");
        a = printAndRead("Просто текст возвращающий строку");
    }

    private static int printAndRead(String text) {
        System.out.println(text);
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(number);
        return number;
    }
}