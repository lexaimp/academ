import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFile {
    public static void main(String[] args) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new FileInputStream("input"))) {

            int count = scanner.nextInt();
            double[] a = new double[count];
            for (int i = 0; i < count; ++i) {
                a[i] = scanner.nextDouble();
            }
        }
    }
}
