import java.util.*;

public class Problem9_NestedTryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter comma-separated integers: ");
        String line = sc.nextLine();
        String[] parts = line.split(",");
        int[] arr = new int[parts.length];
        for (int i = 0; i < parts.length; i++) arr[i] = Integer.parseInt(parts[i].trim());

        System.out.print("Enter index: ");
        int idx = Integer.parseInt(sc.nextLine().trim());
        System.out.print("Enter divisor: ");
        int div = Integer.parseInt(sc.nextLine().trim());

        try {
            int val = arr[idx];
            try {
                int result = val / div;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        }
        sc.close();
    }
}
