import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число a: ");
        double a = scanner.nextDouble();

        System.out.print("Введите число b: ");
        double b = scanner.nextDouble();

        System.out.print("Введите число c: ");
        double c = scanner.nextDouble();

        double epsilon = 1.0e-10;
        double discriminant = Math.pow(b, 2) - 4 * a * c;

        if (Math.abs(a) <= epsilon && Math.abs(b) <= epsilon) {
            System.out.println(a + "x² + " + b + "x + " + c + " = 0");

            if (Math.abs(c) <= epsilon) {
                System.out.println("x - любое число, т.к. x умножить на 0, он будет равен 0");
            } else {
                System.out.println("кореней нет");
            }
        } else if (Math.abs(a) <= epsilon) {
            System.out.println("Уравнение не является квадратным");
            System.out.println(b + "x + " + c + " = 0");

            double x = -(c / b);
            System.out.println("x = " + x);
        } else {
            System.out.println(a + "x² + " + b + "x + " + c + " = 0");
            System.out.println("Дискриминант равен " + discriminant);

            if (discriminant < -epsilon) {
                System.out.println("Корней нет, т.к. дискриминант отрицательный");
            } else if (Math.abs(discriminant) <= epsilon) {
                double x = -b / (2 * a);
                System.out.println("Корень один, т.к. дискриминант равен нулю, x = " + x);
            } else {
                double rootDiscriminant = Math.sqrt(discriminant);
                double x1 = (-b - rootDiscriminant) / (2 * a);
                double x2 = (-b + rootDiscriminant) / (2 * a);
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);

            }
        }
    }
}