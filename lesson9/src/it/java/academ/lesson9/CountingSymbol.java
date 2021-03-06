//import
package it.java.academ.lesson9;

public class CountingSymbol {
    public static void main(String[] args) {
        String string = "q6we4r t54#23 24ty+ ^^";
        System.out.println("Количество букв: " + getLettersCount(string));
        System.out.println("Количество цифр: " + getDigitsCount(string));
        System.out.println("Количество пробелов: " + getSpaceCount(string));
        System.out.println("Количество остальных символов: " + getOtherCount(string));
    }

    public static int getLettersCount(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (Character.isLetter(c)) {
                count++;
            }
        }
        return count;
    }

    public static int getDigitsCount(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (Character.isDigit(c)) {
                count++;
            }
        }
        return count;
    }

    public static int getSpaceCount(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (Character.isWhitespace(c)) {
                count++;
            }
        }
        return count;
    }

    public static int getOtherCount(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (!Character.isWhitespace(c) && !Character.isLetter(c) && !Character.isDigit(c)) {
                count++;
            }
        }
        return count;
    }
}