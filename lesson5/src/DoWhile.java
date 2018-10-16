//done
public class DoWhile {
    public static void main(String[] args) {
        int initialValue = 3;
        int finalValue = 6;
        int i = initialValue;
        int count1 = 0;
        int count2 = 0;
        int sum1 = 0;
        int sum2 = 0;

        do {
            if (i % 2 == 0) {
                sum2 += i;
                ++count2;
            }
            sum1 += i;
            ++i;
            ++count1;
        } while (i <= finalValue);
        double average = (double) sum1 / count1;
        double averageEvenNumber = (double) sum2 / count2;
        System.out.println("Среднее арифметическое чисел = " + average);
        System.out.println("Среднее арифметическое только четных чисел = " + averageEvenNumber);
    }
}
