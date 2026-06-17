import java.util.Scanner;

public class UnitConverter {

    public static double convertKmToMiles(double km) {
        return km * 0.621371;
    }

    public static double convertMilesToKm(double miles) {
        return miles * 1.60934;
    }

    public static double convertMetersToFeet(double meter) {
        return meter * 3.28084;
    }

    public static double convertFeetToMeters(double feet) {
        return feet * 0.3048;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Kilometer: ");
        double km = sc.nextDouble();

        System.out.println("Miles = " + convertKmToMiles(km));

        System.out.print("Enter Miles: ");
        double miles = sc.nextDouble();

        System.out.println("Kilometers = " + convertMilesToKm(miles));

        System.out.print("Enter Meter: ");
        double meter = sc.nextDouble();

        System.out.println("Feet = " + convertMetersToFeet(meter));

        System.out.print("Enter Feet: ");
        double feet = sc.nextDouble();

        System.out.println("Meter = " + convertFeetToMeters(feet));
    }
}