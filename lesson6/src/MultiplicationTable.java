//import
public class MultiplicationTable {
    public static void main(String[] args) {
        int tableSize = 15;

        for (int i = 1; i <= tableSize; i++) {
            if (i == 2) {
                System.out.println();
                String bottomDivider = "----";
                for (int k = 1; k <= tableSize; k++) {
                    System.out.print(bottomDivider);
                }
            }
            System.out.println();
            for (int j = 1; j <= tableSize; j++) {
                int composition = i * j;
                if (i == 1) {                                  //попытка реализации форматированного вывода
                    System.out.printf("|%3d", composition);
                } else {
                    System.out.printf("%4d", composition);
                }
            }
        }
    }
}