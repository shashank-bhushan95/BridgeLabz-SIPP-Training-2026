import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        long temp = number;
        int count = 0;

        // Count digits
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        // Store digits in array
        int[] digits = new int[count];
        temp = number;

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = (int)(temp % 10);
            temp /= 10;
        }

        // Frequency array
        int[] frequency = new int[10];

        // Calculate frequency
        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++;
        }

        // Display frequency
        System.out.println("\nDigit Frequency:");

        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println(i + " -> " + frequency[i]);
            }
        }

        sc.close();
    }
}