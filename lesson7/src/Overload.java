//import 2
public class Overload {
    public static void main(String[] args) {
        System.out.println(getTypeSize((byte) 3));
        System.out.println(getTypeSize((short) 3548));
        System.out.println(getTypeSize(1058));
        System.out.println(getTypeSize((long) 354));
        System.out.println(getTypeSize((float) 674.448));
        System.out.println(getTypeSize(2547.4586));
    }

    private static int getTypeSize(byte value) {
        return 1;
    }

    private static int getTypeSize(short value) {
        return 2;
    }

    private static int getTypeSize(int value) {
        return 4;
    }

    private static int getTypeSize(long value) {
        return 8;
    }

    private static int getTypeSize(float value) {
        return 4;
    }

    private static int getTypeSize(double value) {
        return 8;
    }
}
