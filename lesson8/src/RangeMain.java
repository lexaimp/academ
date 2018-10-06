public class RangeMain {
    public static void main(String[] args) {
        Range segment = new Range(3.99999, 45.00001);
        System.out.println(segment.getLength());
        System.out.println(segment.isInside(14));
        segment.setFrom(15);
        System.out.println(segment.getLength());
        System.out.println(segment.isInside(14));
    }
}
