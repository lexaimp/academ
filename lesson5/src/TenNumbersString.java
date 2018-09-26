public class TenNumbersString {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 99) {
            if (i % 10 <= 0) {
                System.out.print(System.lineSeparator());
            }
            ++i;
            System.out.printf("%4d", i);
        }
        //todo доделать форматирование
        int x = 1;
        int y = 100;
        int n = 10;
        int j = x;
        while (j <= y) {
            if (j % n == 0) {
                System.out.print(System.lineSeparator());
            }
            System.out.printf("%4d", j);
            ++j;
        }
    }
}
