// 1. Надо без ООП +
//
//2. Имя функции должно начинаться с глагола+
//
//3. Не нужно проверять на регистр, лучше сразу переводить+
//
//4. Надо учитывать только буквы+
//
//5. Есть ошибка

public class Palindrome {
    public static void main(String[] args) {
        String string = "А роза упала на лапу Азора";
        System.out.println(isPalindrome(string));
        string = "Аргентина манит негра";
    }

    public static boolean isPalindrome(String string) {
        boolean palindrome = false;
        for (int i = 0, j = string.length() - 1; i < string.length() / 2; i++, j--) { // цикл до середины строки
            char c = string.charAt(i);
            c = Character.toLowerCase(c);
            if (Character.isWhitespace(c) || !Character.isLetter(c)) {
                c = string.charAt(++i);
            }
            char b = string.charAt(j);
            b = Character.toLowerCase(b);
            if (Character.isWhitespace(b) || !Character.isLetter(b)) {
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
