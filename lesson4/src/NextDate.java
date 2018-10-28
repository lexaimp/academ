// done

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
        boolean isLeapYear = true;
        if ((year % 4 != 0) || ((year % 100 == 0) && (year % 400 != 0))) {
            isLeapYear = false;
        }
        boolean error = false;

        if (day <= 0 || month <= 0 || month > 12 || year <= 0) {
            error = true;
        }
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
                } else if (day > 31) {
                    error = true;
                } else {
                    day++;
                }
                break;
            case 12:
                if (day == 31) {
                    day = 1;
                    month = 1;
                    year++;
                } else if (day > 31) {
                    error = true;
                } else {
                    day++;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (day == 30) {
                    day = 1;
                    month++;
                } else if (day > 30) {
                    error = true;
                } else {
                    day++;
                }
                break;
            case 2:
                if (isLeapYear && day == 29) {
                    day = 1;
                    month++;
                } else if (!isLeapYear && day == 28) {
                    day = 1;
                    month++;
                } else if (day > 28) {
                    error = true;
                } else {
                    day++;
                }
                break;
        }
        if (error) {
            System.out.println("Введена ошибочная дата!");
        } else {
            System.out.println(day + "." + month + "." + year);
        }
    }
}