import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координаты точек треугольника:");
        System.out.print("x1 = ");
        int x1 = scanner.nextInt();
        System.out.print("y1 = ");
        int y1 = scanner.nextInt();
        System.out.print("x2 = ");
        int x2 = scanner.nextInt();
        System.out.print("y2 = ");
        int y2 = scanner.nextInt();
        System.out.print("x3 = ");
        int x3 = scanner.nextInt();
        System.out.print("y3 = ");
        int y3 = scanner.nextInt();

        if ((x1 == x2 && x1 == x3) || (y1 == y2 && y1 == y3)) {
            System.out.println("Точки лежат на одной прямой");
        } else {
            //Способ 1
            double area1 = Math.abs(0.5 * ((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3)));
            System.out.println("1 сопсоб. Площадь: " + area1);
            //Способ 2
            //Нахождение длины сторон
            double a = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            double b = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
            double c = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
            double p = (a + b + c) / 2;
            double area2 = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.printf("2 способ. Площадь %.1f", area2);
        }
    }
}