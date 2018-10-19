// done

public class MaxSubstringLength {
    public static void main(String[] args) {
        String string = "bA";
        System.out.println("Максимальная длина подстроки, состоящая из одного и того же символа: " + getMaxSubstringLength(string));
        string = "";
        System.out.println("Максимальная длина подстроки, состоящая из одного и того же символа: " + getMaxSubstringLength(string));
    }

    private static int getMaxSubstringLength(String string) {
        if (string.length() == 0) {
            return 0;
        }
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
