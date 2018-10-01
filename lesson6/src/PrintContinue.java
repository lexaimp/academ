//done
public class PrintContinue {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i == 5 || (i % 3 == 0 || (i >= 60 && i <= 80))) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println();

        int i = 1;
        while (i <= 100) {
            if (i == 5 || (i % 3 == 0 || (i >= 60 && i <= 80))) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
