// 1. Надо без ООП
//
//2. Имя функции должно начинаться с глагола
//
//3. Не нужно проверять на регистр, лучше сразу переводить
//
//4. Надо учитывать только буквы
//
//5. Есть ошибка

public class Palindrome {
    private String string;

    public Palindrome(String string) {
        this.string = string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public boolean palindrome() {
        boolean palindrome = false;
        for (int i = 0, j = string.length() - 1; i < string.length() / 2; i++, j--) { // цикл до середины строки
            char c = string.charAt(i);
            if (Character.isWhitespace(c)) {
                c = string.charAt(++i);
            }
            if (Character.isUpperCase(c)) {
                c = Character.toLowerCase(c);
            }
            char b = string.charAt(j);
            if (Character.isWhitespace(b)) {
                b = string.charAt(--j);
            }
            if (Character.isUpperCase(b)) {
                b = Character.toLowerCase(b);
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
