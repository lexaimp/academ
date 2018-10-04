//1. Неправильно сделано деление
//2. k, j не информативные имена
//3. Надо вывести не только числа, но и текст для пользователя
//4. sum1, sum2 тоже не очень информативные имена
public class DoWhile {
    public static void main(String[] args) {
        int initialValue = 3;
        int finalValue = 6;
        int i = initialValue;
        int j = 0;
        int k = 0;
        int sum1 = 0;
        int sum2 = 0;

        do {
            if (i % 2 == 0) {
                sum1 += i;
                ++k;
            }
            sum2 += i;
            ++i;
            ++j;
        } while (i <= finalValue);
        System.out.println(sum1 / k);
        System.out.println(sum2 / j);
    }
}
