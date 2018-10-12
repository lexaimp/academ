//1. Для 12 и 100 надо константы
//2. Есть ошибка
public class Contribution {
    public static void main(String[] args) {
        double countMoney = 201698.6301369863;
        double depositAmount = getMoneyOnDeposit(countMoney, 12, 10);
        double profit = depositAmount - countMoney;
        System.out.println("Сумма вклада: " + depositAmount);
        System.out.println("Прибыль: " + profit);
    }

    private static double getMoneyOnDeposit(double countMoney, int countOfMonth, double annualRate) {
        final double monthlyRate = annualRate / countOfMonth;
        countMoney = countMoney * (1 + (annualRate /* * 30*/) / (100/* * 365*/));// количество денег на счете после процентного повышения в месяц
        //количество денег на счете * (1 + (процентная ставка, количество дней в месяце,))
        /*for (int i = 0; i <= countOfMonth; i++) {
            final double monthlyPercentage = countMoney / 100 * monthlyRate;
            countMoney += monthlyPercentage;
        }*/
        return countMoney;
    }
}