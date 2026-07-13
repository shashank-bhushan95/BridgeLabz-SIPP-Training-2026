import java.util.*;

public class Problem7_FinallyBlock {
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
            System.out.println("Division by zero is not allowed");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
        } finally {
            System.out.println("Operation completed");
            sc.close();
        }
    }
}
