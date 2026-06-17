import java.util.Scanner;

public class NumberChecker6 {

    public static int sumProperDivisors(int num) {

        int sum = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0)
                sum += i;
        }

        return sum;
    }

    public static boolean isPerfect(int num) {
        return sumProperDivisors(num) == num;
    }

    public static boolean isAbundant(int num) {
        return sumProperDivisors(num) > num;
    }

    public static boolean isDeficient(int num) {
        return sumProperDivisors(num) < num;
    }

    public static int factorial(int n) {

        int fact = 1;

        for (int i = 1; i <= n; i++)
            fact *= i;

        return fact;
    }

    public static boolean isStrong(int num) {

        int original = num;
        int sum = 0;

        while (num > 0) {

            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        System.out.println("Perfect = " + isPerfect(num));
        System.out.println("Abundant = " + isAbundant(num));
        System.out.println("Deficient = " + isDeficient(num));
        System.out.println("Strong = " + isStrong(num));
    }
}