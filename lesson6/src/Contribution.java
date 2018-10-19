// import
public class Contribution {
    public static void main(String[] args) {
        double countMoney = 20000.00;
        double depositAmount = getMoneyOnDeposit(countMoney, 12, 10);
        double profit = depositAmount - countMoney;
        System.out.println("Сумма вклада: " + depositAmount);
        System.out.println("Прибыль: " + profit);
    }

    private static double getMoneyOnDeposit(double countMoney, double monthsCount, double annualRate) {
        final int percent = 100;
        for (int i = 0; i < monthsCount; i++) {
            countMoney = countMoney * (1 + annualRate / (percent * monthsCount));
        }
        return countMoney;
    }
}