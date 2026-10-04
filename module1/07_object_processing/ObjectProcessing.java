class Temperature {
    double celsius;

    double toFahrenheit() {
        return celsius * 9 / 5 + 32;
    }
}

public class ObjectProcessing {
    public static void main(String[] args) {
        Temperature temperature = new Temperature();
        temperature.celsius = 25;
        System.out.println(temperature.toFahrenheit());
    }
}
