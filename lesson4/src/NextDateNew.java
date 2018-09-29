import java.util.Scanner;

public class NextDateNew {
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
        boolean trueYear = year > 0;
        boolean trueMonth = month > 0 && month <= 12;
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                boolean day30;
            case 2:
                if (leapYear && day == 28) ||(!leapYear && day == 29) {
                boolean day;
            }
            break;
            day = 1;
            default:
        }
        boolean day31 = false;
        boolean trueDay = day > 0 && (month == 2 && (day == 28 && leapYear) || (day == 28 && !leapYear) || () day > 31)
        System.out.println(day + "." + month + "." + year);
    }
}