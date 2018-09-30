import java.util.Scanner;

public class Evklid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();

        if (a > b) {// не проверять это условие
            if (a % b == 0) {
                System.out.println(a);
            }
        }else {
            if (b % a == 0) {
                System.out.println(a);
            }
            System.out.println(a + b);
        }
    }
}