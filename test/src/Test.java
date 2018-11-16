//Пирамидальная сортировка - надо без рекурсии



public class Test {
    public static void main(String[] args) {
        int a = 45;
        int b = 165;

        int greatestCommonDivisor = 0;
        int max = a > b ? a : b;
        int min = a < b ? a : b;
        if (max % min == 0) {
            greatestCommonDivisor = min;
        }

        while (max % min > 0) {
            greatestCommonDivisor = max % min;
            max = min;
            min = greatestCommonDivisor;
        }
        System.out.println("НОД = " + greatestCommonDivisor);
    }
}