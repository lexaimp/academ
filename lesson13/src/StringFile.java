import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StringFile {
    public static void main(String[] args) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new FileInputStream("input.txt"), "windows-1251")) {
            String[] s = new String[5];
            int count = 0;

            while (scanner.hasNextLine()) {
                    s[count] = scanner.nextLine();
                    count++;
                    }
                    for (String e : s) {
                    System.out.println(e);
                    }
                    }
                    }
                    }