//import 3

public class Url {
    public static void main(String[] args) {
        String url = ("https://vk.com/it.school.sep2018");
        System.out.println(getServerName(url));
    }

    private static String getServerName(String url) {
        int index1 = url.indexOf("://");
        int index2 = url.indexOf("/", index1 + 3);

        if (index2 == -1) {
            index2 = url.length();
        }
        return url.substring(index1 + 3, index2);
    }
}
