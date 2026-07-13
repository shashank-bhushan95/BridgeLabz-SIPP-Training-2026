import java.util.*;

public class Problem4_MultipleCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter comma-separated integers (or press Enter to simulate null): ");
        String line = sc.nextLine();
        int[] arr = null;
        if (!line.trim().isEmpty()) {
            String[] parts = line.split(",");
            arr = new int[parts.length];
            for (int i = 0; i < parts.length; i++) {
                arr[i] = Integer.parseInt(parts[i].trim());
            }
        }

        System.out.print("Enter index to access: ");
        try {
            int idx = Integer.parseInt(sc.nextLine().trim());
            int val = arr[idx];
            System.out.println("Value at index " + idx + ": " + val);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        } catch (NumberFormatException e) {
            System.out.println("Invalid index!");
        } finally {
            sc.close();
        }
    }
}
