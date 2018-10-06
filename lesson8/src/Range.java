//1. warning в функции
//2. Пусть в этой задаче будет без эпсилон
//3. В этой задаче считаем что начало всегда меньше конца

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
        return from - to;
    }

    public boolean isInside(double number) {
        final double epsilon = 1.0e-10;
        return (number - from >= epsilon && to - number >= epsilon);
    }
}
