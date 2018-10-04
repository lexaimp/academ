public class Range {
    private double from;
    private double to;

    public Range(double from, double to) {
        this.from = from;
        this.to = to;
    }

    public double getFrom() {
        return from;
    }

    public void setFrom(double from) {
        this.from = from;
    }

    public double getTo() {
        return to;
    }

    public void setTo(double to) {
        this.to = to;
    }

    public double getLength() {
        final double epsilon = 1.0e-10;
        if ((from - to) > epsilon) {
            return from - to;
        } else {
            return to - from;
        }
    }

    public boolean isInside(double number) {
        final double epsilon = 1.0e-10;
        if (number - from >= epsilon && to - number >= epsilon) {
            return true;
        } else {
            return false;
        }
    }
}
