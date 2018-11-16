//import

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите коэффициенты:");
        System.out.print("a = ");
        double a = scanner.nextDouble();

        System.out.print("b = ");
        double b = scanner.nextDouble();

        System.out.print("c = ");
        double c = scanner.nextDouble();

        double epsilon = 1.0e-10;

        if (Math.abs(a) <= epsilon) {
            System.out.println("Коэфициент а равен 0, уравнение не является квадратным");

            if (Math.abs(b) <= epsilon) {
                if (Math.abs(c) <= epsilon) {
                    System.out.println("х любое");
                } else {
                    System.out.println("Кореней нет");
                }
            } else {
                double x = -(c / b);
                System.out.println("x = " + x);
            }
        } else {
            double discriminant = Math.pow(b, 2) - 4 * a * c;
            if (discriminant < -epsilon) {
                System.out.println("Корней нет");
            } else if (Math.abs(discriminant) <= epsilon) {
                double x1 = -b / (2 * a);
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
