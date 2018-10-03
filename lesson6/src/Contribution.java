//import
public class Contribution {
    public static void main(String[] args) {
        double countMoney = 200000;
        double depositAmount = getMoneyOnDeposit(countMoney, 12, 10);
        double profit = depositAmount - countMoney;
        System.out.println("Сумма вклада: " + depositAmount);
        System.out.println("Прибыль: " + profit);
    }

    private static double getMoneyOnDeposit(double countMoney, int countOfMonth, double annualRate) {
        final double monthlyRate = annualRate / 12;
        for (int i = 0; i <= countOfMonth; i++) {
            final double monthlyPercentage = countMoney / 100 * monthlyRate;
            countMoney += monthlyPercentage;
        }
        return countMoney;
    }
}