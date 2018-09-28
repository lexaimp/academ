public class PrintFor {
    public static void main(String[] args) {
        for (int i = 100; i >= 1; i--) {
            if (i % 4 == 0) {
                System.out.println(i);
            }
        }
        /*
        int n = 8;
        for (int i = 1; i >= n; i++) {
            System.out.println(Math.pow(i, 2));
            //todo что то тоже доделать
        }
        int sum = 0;
        int count;
        for (int i = 3; i<= 6; i++){
            sum += i;
            ++count;
        }*/
    }
}
