import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double epsilon = 1.0e-10;
        System.out.println("Введите коэффициенты:");
        System.out.print("a = ");
        double a = scanner.nextDouble();
        System.out.print("b = ");
        double b = scanner.nextDouble();
        System.out.print("c = ");
        double c = scanner.nextDouble();
        double x;

        if ((a <= epsilon) && (b <= epsilon)) {
            System.out.println("Коэфиенты не могут быт равны нулю");
        } else if (a <= epsilon) {
            x = -c / b;
            System.out.println("x = " + x);
        } else {
            double discriminant = Math.pow(b, 2) - 4 * a * c;
            System.out.println(discriminant);
            if (discriminant < epsilon) {
                System.out.println("Корней нет");
            } else if (discriminant == 0) {
                double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                System.out.println("1 корень");
                System.out.println("x = " + x1);
            } else {
                double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                System.out.println("x1 = " + x1);
                double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("x2 = " + x2);
            }
        }
    }
}