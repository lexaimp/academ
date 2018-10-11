//import
public class MultiplicationTable {
    public static void main(String[] args) {
        int tableSize = 7;

        for (int i = 1; i <= tableSize; i++) {
            System.out.printf("%3d%s", i, "|");
            if (i == tableSize) {
                System.out.println();
                for (int j = 1; j <= tableSize; j++) {
                    System.out.print("----");
                }
            }
        }
        for (int i = 2; i <= tableSize; i++) {
            System.out.println();
            for (int j = 1; j <= tableSize; j++) {
                int composition = i * j;
                if (j == 1) {
                    System.out.printf("%3d%s", composition, "|");
                } else if (j == tableSize) {
                    System.out.printf("%4d", composition);
                    System.out.println();
                    System.out.print("----");
                } else {
                    System.out.printf("%4d", composition);
                }
            }
        }
    }
}