import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountEntry {
    public static void main(String[] args) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new FileInputStream("input.txt"), "windows-1251")) {
            String string = "";
            while (scanner.hasNext()) {
                string += scanner.nextLine();
            }
            System.out.println(countEntry(string, "of"));
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