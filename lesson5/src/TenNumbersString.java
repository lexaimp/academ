//import
public class TenNumbersString {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 100) {
            System.out.printf("%4d", i);
            if (i % 10 == 0) {
                System.out.print(System.lineSeparator());
            }
            ++i;
        }
        //todo доделать форматирование
        int x = 4;
        int y = 54;
        int n = 3;
        int j = x;
        int count = 1;
        System.out.println();

        while (j <= y) {
            System.out.printf("%4d", j);
            if (count % n == 0) {
                System.out.print(System.lineSeparator());
            }
            ++j;
            count++;
        }
    }
}
