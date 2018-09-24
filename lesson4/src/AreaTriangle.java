import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координаты точек треугольника:");

        System.out.print("x1 = ");
        double x1 = scanner.nextDouble();
        System.out.print("y1 = ");
        double y1 = scanner.nextDouble();

        System.out.print("x2 = ");
        double x2 = scanner.nextDouble();
        System.out.print("y2 = ");
        double y2 = scanner.nextDouble();

        System.out.print("x3 = ");
        double x3 = scanner.nextDouble();
        System.out.print("y3 = ");
        double y3 = scanner.nextDouble();
        double epsilon = 1.0e-10;

        if (Math.abs((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3)) <= epsilon) {
            System.out.println("Точки лежат на одной прямой");
        } else {
            //Способ 1 не из условия
            double area1 = Math.abs(0.5 * ((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3)));
            System.out.println("1 сопсоб. Площадь: " + area1);
            //Способ 2 из условия
            //Нахождение длин сторон
            double a = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            double b = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
            double c = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));

            double semiPerimeter = (a + b + c) / 2;
            double area2 = Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c));
            System.out.printf("2 способ. Площадь %.1f", area2);
        }
    }
}