//done

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ToUpRegister {
    public static void main(String[] args) throws IOException {
        try (Scanner scanner = new Scanner(new FileInputStream("file1.txt"), "windows-1251");
             PrintWriter writer = new PrintWriter("file2.txt")) {
            while (scanner.hasNextLine()) {
                String string = scanner.nextLine();
                writer.println(string.toUpperCase());
            }
        }
    }
}
