//import 2

public class TemperatureTranslation {
    public static void main(String[] args) {
        System.out.println(getFahrenheit(32));
        System.out.println(getKelvin(32));
    }

    private static double getFahrenheit(double degreesCelsius) {
        return degreesCelsius * ((double) 9 / 5) + 32;
    }

    private static double getKelvin(double degreesCelsius) {
        return degreesCelsius + 273.15;
    }
}
