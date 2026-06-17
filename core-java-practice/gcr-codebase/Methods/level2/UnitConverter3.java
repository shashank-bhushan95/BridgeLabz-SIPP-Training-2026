import java.util.Scanner;

public class UnitConverter3 {

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static double poundsToKilograms(double p) {
        return p * 0.453592;
    }

    public static double kilogramsToPounds(double k) {
        return k * 2.20462;
    }

    public static double gallonsToLiters(double g) {
        return g * 3.78541;
    }

    public static double litersToGallons(double l) {
        return l * 0.264172;
    }

    public static void main(String[] args) {

        System.out.println("F to C = " + fahrenheitToCelsius(98.6));
        System.out.println("C to F = " + celsiusToFahrenheit(37));
        System.out.println("Pounds to Kg = " + poundsToKilograms(100));
        System.out.println("Kg to Pounds = " + kilogramsToPounds(50));
        System.out.println("Gallons to Liters = " + gallonsToLiters(5));
        System.out.println("Liters to Gallons = " + litersToGallons(10));
    }
}