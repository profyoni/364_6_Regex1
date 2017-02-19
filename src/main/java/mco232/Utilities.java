package mco232;

public class Utilities {

    public static double fahrenheitToCelsius(double temp) {
        return (temp - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double temp) {
        return temp * 9 / 5 + 32;
    }

    public static double kelvinToCelsius(double temp) {
        return temp - 273.15;
    }

    public static double celsiusToKelvin(double temp) {
        return temp + 273.15;
    }

    public static double fahrenheitToKelvin(double temp) {
        return (temp - 32) * 5 / 9 + 273.15;
    }

    public static double kelvinToFahrenheit(double temp) {
        return (temp - 273.15) * 9 / 5 + 32;
    }

    public static double convert(double temp, TemperatureUnit from, TemperatureUnit to) {
        if (from == null || to == null) {
            String s = String.format("Arguments 'to' or 'from' are null. Actual values to=[%s], from=[%s]");
            throw new IllegalArgumentException();
        }
        switch (from) {
            case Kelvin:
                switch (to) {
                    case Kelvin:
                        return temp;
                    case Celsius:
                        return kelvinToCelsius(temp);
                    case Fahrenheit:
                        return kelvinToFahrenheit(temp);
                }
            case Celsius:
                switch (to) {
                    case Kelvin:
                        return celsiusToKelvin(temp);
                    case Celsius:
                        return temp;
                    case Fahrenheit:
                        return celsiusToFahrenheit(temp);
                }
            case Fahrenheit:
                switch (to) {
                    case Kelvin:
                        return fahrenheitToKelvin(temp);
                    case Celsius:
                        return fahrenheitToCelsius(temp);
                    case Fahrenheit:
                        return temp;
                }

        }
        String s = String.format("Arguments 'to' or 'from' are not supported. Actual values to=[%s], from=[%s]");
        throw new IllegalArgumentException();
    }
}

enum TemperatureUnit {
    Kelvin, Celsius, Fahrenheit
};
