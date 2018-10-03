//import

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

        if (Math.abs(a) <= epsilon) {
            System.out.println("Коэфициент а не может быть равен 0");
        } else if (Math.abs(b) <= epsilon && Math.abs(c) <= epsilon) {
            double x = 0;
            System.out.println("1 корень");
            System.out.println("x = " + x);
        } else if (Math.abs(b) <= epsilon && -(c / a) > epsilon) {
            double x1 = -Math.sqrt(-c / a);
            System.out.println("x1 = " + x1);
            double x2 = -Math.sqrt(-c / a);
            System.out.println("x2 = " + x2);
        } else if (Math.abs(c) <= epsilon) {
            double x1 = 0;
            System.out.println("x1 = " + x1);
            double x2 = -(b / a);
            System.out.println("x2 = " + x2);
        } else {
            double discriminant = Math.pow(b, 2) - 4 * a * c;
            if (discriminant < epsilon) {
                System.out.println("Корней нет");
            } else if ((discriminant) <= epsilon) {
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
