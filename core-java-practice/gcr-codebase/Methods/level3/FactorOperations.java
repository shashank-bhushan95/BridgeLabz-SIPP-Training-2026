import java.util.Scanner;

public class FactorOperations {

    public static int[] findFactors(int num) {

        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                count++;
        }

        int[] factors = new int[count];
        int index = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                factors[index++] = i;
        }

        return factors;
    }

    public static int greatestFactor(int[] factors) {
        return factors[factors.length - 1];
    }

    public static int sumFactors(int[] factors) {

        int sum = 0;

        for (int factor : factors)
            sum += factor;

        return sum;
    }

    public static long productFactors(int[] factors) {

        long product = 1;

        for (int factor : factors)
            product *= factor;

        return product;
    }

    public static double cubeProduct(int[] factors) {

        double product = 1;

        for (int factor : factors)
            product *= Math.pow(factor, 3);

        return product;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        int[] factors = findFactors(num);

        System.out.print("Factors: ");

        for (int factor : factors)
            System.out.print(factor + " ");

        System.out.println("\nGreatest Factor = "
                + greatestFactor(factors));

        System.out.println("Sum = "
                + sumFactors(factors));

        System.out.println("Product = "
                + productFactors(factors));

        System.out.println("Cube Product = "
                + cubeProduct(factors));
    }
}