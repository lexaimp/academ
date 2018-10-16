//import
public class MaxSubstringLength {
    public static void main(String[] args) {
        String string = "a";
        System.out.println("Максимальная длина подстроки, состоящая из одного и того же символа: " + getMaxSubstringLength(string));
        string = "";
        System.out.println("Максимальная длина подстроки, состоящая из одного и того же символа: " + getMaxSubstringLength(string));
    }

    private static int getMaxSubstringLength(String string) {
        int count = 1;
        int maxCount = 0;
        if (string.length() - 1 == 0) {
            return 1;
        }
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
