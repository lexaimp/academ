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
        String string = "  a  a ";
        System.out.println(isPalindrome(string));
        string = "А роза упала на лапу Азора";
        System.out.println(isPalindrome(string));
        string = "Аргентина, манит негра";
        System.out.println(isPalindrome(string));
    }

    public static boolean isPalindrome(String string) {
        int firstElementOfString = 0;
        int lastElementOfString = string.length() - 1;
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(firstElementOfString);
            while (!Character.isLetter(c)) {
                if (firstElementOfString == string.length() - 1) {
                    break;
                }
                c = string.charAt(firstElementOfString + 1);
                firstElementOfString++;
            }
            c = Character.toLowerCase(c);
            char b = string.charAt(lastElementOfString);
            while (!Character.isLetter(b)) {
                if (lastElementOfString == 1) {
                    break;
                }
                b = string.charAt(lastElementOfString - 1);
                lastElementOfString++;
            }
            b = Character.toLowerCase(b);
            if (c != b) {
                return false;
            }
        }
        return true;
    }
}