//import 2

public class OrderCost {
    public static void main(String[] args) {
        System.out.println(getOrderCost(7, 34.50, 17, 125.80));
    }

    private static double getOrderCost(int count1, double price1, int count2, double price2) {
        int discountPrice = 0;
        int discountCount = 0;
        final int totalQuantity = 10;
        final int totalCosts = 1000;

        if (count1 + count2 >= totalQuantity) {
            discountCount = 5;
        }
        double priceNoDiscount = (count1 * price1) + (count2 * price2);
        if (priceNoDiscount >= totalCosts) {
            discountPrice = 5;
        }
        double discount = priceNoDiscount / 100 * (discountCount + discountPrice);
        return priceNoDiscount - discount;
    }
}
