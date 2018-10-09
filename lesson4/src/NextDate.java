//todo

import java.util.Scanner;

public class NextDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Сегодняшняя дата: ");
        System.out.print("День: ");
        int day = scanner.nextInt();
        System.out.print("Месяц: ");
        int month = scanner.nextInt();
        System.out.print("Год: ");
        int year = scanner.nextInt();

//      Проверка явлется ли год високосным
        boolean leapYear = true;
        if ((year % 4 != 0) || ((year % 100 == 0) && (year % 400 != 0))) {
            leapYear = false;
        }
        if (day > 0 && month > 0 && year > 0) {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                    if (day == 31) {
                        day = 1;
                        month++;
                    }
                    break;
                case 12:
                    if (day == 31) {
                        day = 1;
                        month = 1;
                        year++;
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    if (day == 30) {
                        day = 1;
                        month++;
                    }
                    break;
                case 2:
                    if (leapYear && day == 29) {
                        day = 1;
                        month++;
                    } else if (day == 28) {
                        day = 1;
                        month++;
                    }
                    break;
            }
        }
        System.out.println(day + "." + month + "." + year);
    }
}