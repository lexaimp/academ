//import 3

public class StringBuilder1 {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 99; i++) {
            sb.append(i)
                    .append(", ");
        }
        sb.append(100);
        System.out.println(sb);
    }
}
