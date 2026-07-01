import java.io.*;
import java.util.Scanner;

public class DailyExpenseLogger {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            BufferedWriter bw = new BufferedWriter(new FileWriter("expenses.txt", true));

            System.out.print("Category: ");
            String category = sc.nextLine();

            System.out.print("Amount: ");
            int amount = sc.nextInt();

            bw.write(category + " - " + amount);
            bw.newLine();

            bw.close();

            System.out.println("Expense Saved.");

        } catch (IOException e) {

            System.out.println("File Error");
        }
    }
}