// import 3
public class MultiplicationTable {
    public static void main(String[] args) {
        int tableSize = 9;

        System.out.print("   |");
        for (int i = 1; i <= tableSize; i++) {
            System.out.printf("%3d%s", i, "|");
        }
        System.out.println();
        System.out.print("---|");
        for (int i = 1; i <= tableSize; i++) {
            System.out.print("----");
        }
        for (int i = 1; i <= tableSize; i++) {
            System.out.println();
            for (int j = 1; j <= tableSize; j++) {
                int composition = i * j;
                if (j == 1) {
                    System.out.printf("%2d%s", composition, " |");
                }
                System.out.printf("%3d%s", composition, " ");
            }
        }
    }
}