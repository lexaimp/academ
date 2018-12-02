public class Euclid2 {
    public static void main(String[] args) {
        System.out.println(getGcd(45, 165));
    }

    private static int getGcd(int a, int b) {
        if (b != 0){
            while (a % b != 0){
                int temp = a;
                a = b;
                b = temp % b;
            }
            return b;
        } else if (a !=0){
            return a;
        }
        return 0;
    }
}
