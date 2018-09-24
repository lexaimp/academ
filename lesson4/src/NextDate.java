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
        boolean nextDay = month != 2 && ((month % 2 == 0 && day == 30) || (day == 31));
        boolean nextDatFebruary = (leapYear && day == 28) || (!leapYear && day == 29);
        boolean dateError = day > 31 || month > 12;
        if ((month % 2 == 0 && day > 30) || (day > 31) || (month > 12) || (day <= 0 || month <= 0 || year <= 0)) {
            System.out.println("Введена ошибочная дата");
            return;
        } else if (!dateError && (nextDay || nextDatFebruary)) {
            day = 1;
            month++;
            if (month > 12) {
                month = 1;
                year++;
            }
        } else {
            day++;
        }
        System.out.println(day + "." + month + "." + year);
    }
}