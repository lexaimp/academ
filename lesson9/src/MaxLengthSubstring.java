//import
public class MaxLengthSubstring {
    public static void main(String[] args) {
        String string = "dfeAaaAfessSSSssVVvvvvVV";
        System.out.println("Максимальная длина подстроки, состоящая из одного и того же символа: " + getMaxLengthSubstring(string));
    }

    public static int getMaxLengthSubstring(String string) {
        int count = 1;
        int maxCount = 1;
        for (int i = 0; i < string.length() - 1; i++) {
            char c = string.charAt(i);
            char d = string.charAt(i + 1);
            c = Character.toLowerCase(c);
            d = Character.toLowerCase(d);
            if (c == d) {
                count++;
                if (maxCount <= count) {
                    maxCount = count;
                }
            } else {
                count = 1;
            }
        }
        return maxCount;
    }
}
