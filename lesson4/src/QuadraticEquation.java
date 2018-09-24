/*
1. Ошибки в проверке вещественных чисел
2. Если a, b равны 0, там должно быть 2 случая в зависимости от c
3. Надо везде через эпсилон
4. Когда дискриминант 0, то надо упростить формулу +
 */

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

        if (Math.abs(a - a) <= epsilon && Math.abs(b - b) <= epsilon) {
            if (Math.abs(c - c) <= epsilon) {
                System.out.println("Коэфиенты не могут быт равны нулю");
            } else if ((c - c) > epsilon) {
                System.out.println("Неверно заданы коэффициенты уравнения");
            }
        } else if (Math.abs(a - a) <= epsilon) {
            x = -c / b;
            System.out.println("x = " + x);
        } else {
            double discriminant = Math.pow(b, 2) - 4 * a * c;
            System.out.println(discriminant);
            if (discriminant < 0) {
                System.out.println("Корней нет");
            } else if ((discriminant - discriminant) <= epsilon) {
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