//done

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String enigmaticString = "qwerty";
        for (; ; ) {
            System.out.println("Введите загаданную строку:");
            String enigmaticStringUser = scanner.nextLine();
            if (enigmaticString.equals(enigmaticStringUser)) {
                break;
            }
        }
    }
}
