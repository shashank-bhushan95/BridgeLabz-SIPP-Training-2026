import java.util.*;

public class Problem3_CustomException {
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        try {
            int age = sc.nextInt();
            validateAge(age);
            System.out.println("Access granted!");
        } catch (InvalidAgeException e) {
            System.out.println("Age must be 18 or above");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
        } finally {
            sc.close();
        }
    }
}
