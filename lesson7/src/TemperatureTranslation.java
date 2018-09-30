public class TemperatureTranslation {
    public static void main(String[] args) {
        System.out.println(getFahrenheit(32));
        System.out.println(getKelvin(32));
    }

    private static double getFahrenheit(double cesium) {
        return cesium * ((double) 9 / 5) + 32;
    }

    private static double getKelvin(double cesium) {
        return cesium + 273.15;
    }
}
