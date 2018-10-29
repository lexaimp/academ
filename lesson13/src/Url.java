//import

public class Url {
    public static void main(String[] args) {
        String url = new String("https://vk.com/it.school.sep2018");
        System.out.println(serverName(url));
    }

    private static String serverName(String url) {
        int index1 = url.indexOf("://");
        int index2 = url.indexOf("/", index1 + 3);

        if (index2 == -1) {
            index2 = url.length();
        }
        return url.substring(index1 + 3, index2);
    }
}
