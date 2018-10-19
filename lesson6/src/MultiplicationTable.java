// done
public class MultiplicationTable {
    public static void main(String[] args) {
        int tableSize = 9;

        System.out.print("   |");
        for (int i = 1; i <= tableSize; i++) {
            System.out.printf("%3d|", i);
        }
        System.out.println();
        System.out.print("---|");
        for (int i = 1; i <= tableSize; i++) {
            System.out.print("----");
        }

        for (int i = 1; i <= tableSize; i++) {
            System.out.printf("%n%2d |", i);
            for (int j = 1; j <= tableSize; j++) {
                int composition = i * j;
                System.out.printf("%3d ", composition);
            }
        }
    }
}