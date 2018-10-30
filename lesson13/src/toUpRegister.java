//import

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class toUpRegister {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        try (Scanner scanner = new Scanner(new FileInputStream("file1.txt"), "windows-1251");
             PrintWriter writer = new PrintWriter("file2.txt")) {
            String[] s = new String[5];
            int count = 0;

            while (scanner.hasNextLine()) {
                s[count] = scanner.nextLine();
                count++;
            }
            for (String e : s) {
                for (int j = 0; j < e.length(); j++) {
                    char letter = Character.toUpperCase(e.charAt(j));
                    writer.print(letter);
                }
                writer.println();
            }
        }
    }
}
