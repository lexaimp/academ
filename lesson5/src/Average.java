//done
public class Average {
    public static void main(String[] args) {
        int initialValue = 3;
        int finalValue = 10;
        int i = initialValue;
        int count2 = 0;
        int count1 = 0;
        int sum1 = 0;
        int sum2 = 0;

        while (i <= finalValue) {
            if (i % 2 == 0) {
                sum1 += i;
                ++count1;
            }
            sum2 += i;
            ++count2;
            ++i;
        }
        double average = (double) sum2 / count2;
        double averageEvenNumber = (double) sum1 / count1;
        System.out.println("Среднее арифметическое чисел от 3 до 17 = " + average);
        System.out.println("Среднее арифметическое только четных чисел от 3 до 17 = " + averageEvenNumber);
    }
}