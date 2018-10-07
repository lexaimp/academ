//import
package it.java.academ.lesson9;

public class CountingSymbol {
    private String string;

    public CountingSymbol(String string) {
        this.string = string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public int getCountLitters() {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (Character.isLetter(c)) {
                count++;
            }
        }
        return count;
    }

    public int getCountDigit() {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (Character.isDigit(c)) {
                count++;
            }
        }
        return count;
    }

    public int getCountSpace() {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (Character.isWhitespace(c)) {
                count++;
            }
        }
        return count;
    }

    public int getCountOther() {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (!Character.isWhitespace(c) && !Character.isLetter(c) && !Character.isDigit(c)) {
                count++;
            }
        }
        return count;
    }

    public int getMaxSubstring() {
        int count = 1;
        int maxCount = 1;
        char d = 0;
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (Character.isUpperCase(c)) {
                c = Character.toLowerCase(c);
            }
            if (c == d) {
                count++;
                if (maxCount <= count) {
                    maxCount = count;
                }
            } else {
                count = 1;
            }
            d = c;
        }
        return maxCount;
    }
}
