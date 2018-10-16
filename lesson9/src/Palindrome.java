//1. Переменная palindrome не нужна, можно сразу делать return +
//
//2. Плохо использовать ++ как выражение +
//
//3. Неверное условие цикла
//
//4. Переводить в регистр лучше уже потом, когда понятно что это буквы
//
//5. Упадет на строке из нескольких пробелов

public class Palindrome {
    public static void main(String[] args) {
        String string = "aabbaa";
        System.out.println(isPalindrome(string));
        string = "А роза упала на лапу Азора";
        System.out.println(isPalindrome(string));
        string = "Аргентина манит негра";
        System.out.println(isPalindrome(string));
    }

    private static boolean isPalindrome(String str) {
        int middle = str.length() / 2;
        if (str.length() % 2 != 0) {
            middle = str.length() / 2 - 1;
        }
        for (int i = 0; i < middle; i++) {
            if (str.charAt(i) != str.charAt(middle + i)) {
                return false;
            }
        }
        return true;
    }
}