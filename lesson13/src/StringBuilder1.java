//import 2

public class StringBuilder1 {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < 100; i++) {
            sb.append(i)
                    .append(", ");
        }
        sb.append(100);
        System.out.println(sb);
    }
}
