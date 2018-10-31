import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountEntry {
    public static void main(String[] args) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new FileInputStream("input.txt"), "windows-1251")) {
            int count = 0;
            while (scanner.hasNext()) {
                count += countEntry(scanner.nextLine(), "of");
            }
            System.out.println(count);
        }
    }

    private static int countEntry(String string, String substring) {
        String s = string.toLowerCase();
        int i = s.indexOf(substring);
        int count = 0;
        
        while (i != -1) {
            i = s.indexOf(substring, i + 1);
            count++;
        }
        return count;
    }
}