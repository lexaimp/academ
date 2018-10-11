//1. Переменная palindrome не нужна, можно сразу делать return
//
//2. Плохо использовать ++ как выражение
//
//3. Неверное условие цикла
//
//4. Переводить в регистр лучше уже потом, когда понятно что это буквы
//
//5. Упадет на строке из нескольких пробелов

public class Palindrome {
    public static void main(String[] args) {
        String string = "   ";
        System.out.println(string.length());
        System.out.println(isPalindrome(string));
        string = "А роза упала на лапу Азора";
        System.out.println(isPalindrome(string));
        string = "Аргентина, манит негра";
        System.out.println(isPalindrome(string));
    }

    public static boolean isPalindrome(String string) {
        for (int i = 0, j = string.length() - 1; i < string.length() && j > 0; i++, j--) {
            char c = string.charAt(i);
            while (!Character.isLetter(c)) {
                c = string.charAt(i + 1);
                ++i;
                if (i >= string.length() - 1) {
                    return false;
                }
            }
            c = Character.toLowerCase(c);
            char b = string.charAt(j);
            while (!Character.isLetter(b)) {
                b = string.charAt(j - 1);
                --j;
                if (j < 0) {
                    return false;
                }
            }
            b = Character.toLowerCase(b);
            if (c != b) {
                return false;
            }
        }
        return true;
    }
}