//import 2

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountEntry {
    public static void main(String[] args) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new FileInputStream("input.txt"))) {
            int count = 0;
            while (scanner.hasNext()) {
                count += countOfEntry(scanner.nextLine(), "of");
            }
            System.out.println(count);
        }
    }

    private static int countOfEntry(String string, String substring) {
        String s = string.toLowerCase();
        int i = s.indexOf(substring.toLowerCase());
        int count = 0;

        while (i != -1) {
            i = s.indexOf(substring, i + substring.length());
            count++;
        }
        return count;
    }
}