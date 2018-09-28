public class PrintContinue {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }

        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0 || i >= 60 && i <= 80) {
                continue;
            }
            System.out.println(i);
        }
        //todo долеать с циклом while
        /*int i = 0;
        while (i <= 100){
            if (i % 3 == 0 || i >= 60 && i <= 80) {
                continue;
            }
            System.out.println(i);
            i++;
        }*/
    }
}
