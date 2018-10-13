//import

import java.util.Arrays;

public class ArrayOfStringsInUpperRegister {
    public static void main(String args[]) {
        String[] array = {"Hello", "my", "name", "is", "Tom"};
        System.out.println(Arrays.toString(array));
        toUpperCase(array);
        System.out.println(Arrays.toString(array));
    }

    public static void toUpperCase(String[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].toUpperCase();
        }
    }
}
