//import

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String enigmaticString = "qwerty";
        System.out.println("Введите загаданную строку:");
        String enigmaticStringUser = scanner.nextLine();
        for (; ; ) {
            if (enigmaticString.equals(enigmaticStringUser)) {
                break;
            }
            System.out.println("Введите загаданную строку:");
            enigmaticStringUser = scanner.nextLine();
        }
    }
}
