// import
public class Contribution {
    public static void main(String[] args) {
        double countMoney = 200000;
        System.out.println("Сумма вклада: " + getMoneyOnDeposit(countMoney, 12, 10));
        System.out.println("Прибыль: " + (getMoneyOnDeposit(countMoney, 12, 10) - countMoney));
    }

    private static double getMoneyOnDeposit(double countMoney, int month, double annualRate) {
        double monthlyRate = annualRate / 12;
        for (int i = 0; i <= month; i++) {
            double monthPercent = countMoney / 100 * monthlyRate;
            countMoney += monthPercent;
        }
        return countMoney;
    }
}