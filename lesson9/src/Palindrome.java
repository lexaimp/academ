//1. Пусть строка без букв считается палиндромом
//п.1 не везде исправлен

public class Palindrome {
    public static void main(String[] args) {
        String string = "";
        System.out.println(isPalindrome(string));
        string = "А роза упала на лапу Азора";
        System.out.println(isPalindrome(string));
        string = "Аргентина, манит негра";
        System.out.println(isPalindrome(string));
    }

    private static boolean isPalindrome(String string) {
        if (string.length() == 0) { //?
            return false;
        }
        int left = 0;
        int right = string.length() - 1;
        while (left < right) {
            while (!Character.isLetter(string.charAt(left)) && left < right) {
                left++;
            }
            char leftElement = string.charAt(left);
            while (!Character.isLetter(string.charAt(right)) && left < right) {
                right--;
            }
            char rightElement = string.charAt(right);
            if (left < right) {
                leftElement = Character.toLowerCase(leftElement);
                rightElement = Character.toLowerCase(rightElement);
                if (leftElement != rightElement) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
}