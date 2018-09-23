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
        boolean leapYear;
        if ((year % 4 != 0) || ((year % 100 == 0) && (year % 400 != 0))) {
            leapYear = false;
        } else {
            leapYear = true;
        }


        if ((leapYear && day == 29) || (!leapYear && day == 28) && (month == 2)) {
            day = 1;
            month ++;
        } else {
            day ++;
        }

        if (month == 12){
            month = 1;
            year ++;
        }else {
            month ++;
        }
        year ++;

        System.out.println();
    }
}