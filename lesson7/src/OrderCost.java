public class OrderCost {
    public static void main(String[] args) {
        System.out.println(orderCost(7, 34.50, 17, 125.80));
    }

    private static double orderCost(int countFirstProduct, double price1, int countSecondProduct, double price2) {
        int discountCount = 0;
        int discountPrice = 0;

        if (countFirstProduct + countSecondProduct >= 10) {
            discountCount = 5;
        }
        double priceNoDiscount = (countFirstProduct * price1) + (countSecondProduct * price2);
        if (priceNoDiscount >= 1000) {
            discountPrice = 5;
        }
        double discount = priceNoDiscount / 100 * (discountCount + discountPrice);
        return priceNoDiscount - discount;
    }
}
