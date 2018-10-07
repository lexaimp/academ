//import

public class PalindromeMain {
    public static void main(String[] args) {
        Palindrome string = new Palindrome("А роза упала на лапу Азора");
        System.out.println(string.palindrome());

        string.setString("Аргентина манит негра");
        System.out.println(string.palindrome());
    }
}
