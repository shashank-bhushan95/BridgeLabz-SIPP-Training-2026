import java.io.*;
import java.util.*;

public class DailyExpenseLogger {
    public static void main(String[] args) {
        String outputFile = "expenses.txt";
        Scanner sc = new Scanner(System.in);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile, true))) {
            System.out.print("Enter expense category: ");
            String category = sc.nextLine().trim();
            System.out.print("Enter expense amount: ");
            String amount = sc.nextLine().trim();
            bw.write(category + " - " + amount);
            bw.newLine();
            System.out.println("Expense recorded to " + outputFile);
        } catch (IOException e) {
            System.out.println("Error writing expenses.");
        } finally {
            sc.close();
        }
    }
}
