import java.util.Scanner;

public class TriangularPark {

    public static double calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        return 5000 / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Side 1: ");
        double a = sc.nextDouble();

        System.out.print("Enter Side 2: ");
        double b = sc.nextDouble();

        System.out.print("Enter Side 3: ");
        double c = sc.nextDouble();

        System.out.println("Rounds Required = " + calculateRounds(a, b, c));
    }
}