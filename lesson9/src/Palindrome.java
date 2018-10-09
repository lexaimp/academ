//import

public class Palindrome {
    public static void main(String[] args) {
        String string = "А роза упала на лапу Азора";
        System.out.println(isPalindrome(string));
        string = "Аргентина манит негра";
        System.out.println(isPalindrome(string));
    }

    public static boolean isPalindrome(String string) {
        boolean palindrome = false;
        for (int i = 0, j = string.length() - 1; i < string.length() / 2; i++, j--) { // цикл до середины строки
            char c = string.charAt(i);
            c = Character.toLowerCase(c);
            while (!Character.isLetter(c)) {
                c = string.charAt(++i);
            }
            char b = string.charAt(j);
            b = Character.toLowerCase(b);
            while (!Character.isLetter(b)) {
                b = string.charAt(--j);
            }
            if (c == b) {
                palindrome = true;
            } else {
                palindrome = false;
                break;
            }
        }
        return palindrome;
    }
}
