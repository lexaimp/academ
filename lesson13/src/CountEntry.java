// import 3

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountEntry {
    public static void main(String[] args) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new FileInputStream("input.txt"))) {
            int count = 0;
            while (scanner.hasNext()) {
                count += getCountOfEntry(scanner.nextLine(), "OF");
            }
            System.out.println(count);
        }
    }

    private static int getCountOfEntry(String string, String substring) {
        String s = string.toLowerCase();
        String sub = substring.toLowerCase();
        int i = s.indexOf(sub);
        int count = 0;

        while (i != -1) {
            i = s.indexOf(sub, i + sub.length());
            count++;
        }
        return count;
    }
}