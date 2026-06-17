import java.util.Scanner;

public class UnitConverter2 {

    public static double convertYardsToFeet(double yards) {
        return yards * 3;
    }

    public static double convertFeetToYards(double feet) {
        return feet * 0.333333;
    }

    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }

    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254;
    }

    public static double convertInchesToCm(double inches) {
        return inches * 2.54;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Yards to Feet: " + convertYardsToFeet(5));
        System.out.println("Feet to Yards: " + convertFeetToYards(15));
        System.out.println("Meters to Inches: " + convertMetersToInches(2));
        System.out.println("Inches to Meters: " + convertInchesToMeters(20));
        System.out.println("Inches to Cm: " + convertInchesToCm(10));
    }
}