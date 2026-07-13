import java.util.*;

public class Problem2_UncheckedException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter numerator: ");
            int a = sc.nextInt();
            System.out.print("Enter denominator: ");
            int b = sc.nextInt();
            int res = a / b;
            System.out.println("Result: " + res);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input: Enter numeric values");
        } finally {
            sc.close();
        }
    }
}
