//import 3
public class Contribution {
    public static void main(String[] args) {
        double countMoney = 20000.00;
        double depositAmount = getMoneyOnDeposit(countMoney);
        double profit = depositAmount - countMoney;
        System.out.println("Сумма вклада: " + depositAmount);
        System.out.println("Прибыль: " + profit);
    }

    private static double getMoneyOnDeposit(double countMoney) {
        final int countOfMonth = 12;
        final double annualRate = 10;
        final int percent = 100;
        for (int i = 0; i < 12; i++) {
            countMoney = countMoney * (1 + (annualRate) / (percent * countOfMonth));
        }
        return countMoney;
    }
}