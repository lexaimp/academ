import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Число 1");
        double nomber1 = scanner.nextDouble();
        System.out.println("Число 2");
        double nomber2 = scanner.nextDouble();
        System.out.println("Команда");
        int command = scanner.nextInt();
        switch (command) {
            case 1:
                System.out.println(nomber1 + nomber2);
                break;
            case 2:
                System.out.println(nomber1 - nomber2);
                break;
            case 3:
                System.out.println(nomber1 * nomber2);
                break;
            case 4:
                System.out.println(nomber1 / nomber2);
                break;
            default:
                System.out.println("Неизвестная операция");
        }
    }
}