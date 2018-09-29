import java.util.Scanner;

public class Evklid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();

        while (a > b) {
            if (a % b == 0) {
                System.out.println(a);
            }
        }
    }
}