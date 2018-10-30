import java.util.Arrays;

public class SplitString {
    public static void main(String[] args) {
        String string = new String("1, 2, 3, 4, 5");
        String[] numbers = string.split(", ");
        int sum = 0;
        for (String e : numbers) {
            sum += Integer.parseInt(e);
        }
        System.out.println(sum);
    }
}
