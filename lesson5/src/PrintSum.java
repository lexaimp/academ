//done
import java.util.Scanner;

public class PrintSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи команду");
        String command = scanner.nextLine();
        switch (command){
            case "print":
                System.out.println("Введите строку");
                String newString = scanner.nextLine();
                System.out.println(newString);
                break;
            case "sum":
                System.out.println("Введите 2 вещественных числа");
                double number1 = scanner.nextDouble();
                double number2 = scanner.nextDouble();
                System.out.println(number1+number2);
                break;
            default:
                System.out.println("Эта команда не известна");
        }
    }
}