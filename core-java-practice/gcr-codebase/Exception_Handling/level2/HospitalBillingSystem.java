import java.util.Scanner;

class InsufficientFundsException extends Exception {
    InsufficientFundsException(String message) {
        super(message);
    }
}

public class HospitalBillingSystem {

    static void payBill(double balance, double bill)
            throws InsufficientFundsException {

        if (bill > balance) {
            throw new InsufficientFundsException("Payment failed: Insufficient funds!");
        }

        System.out.println("Payment Successful");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] bills = {1000, 2000, 3000};

        try {

            System.out.print("Enter patient index: ");
            int index = Integer.parseInt(sc.nextLine());

            System.out.print("Enter number of items: ");
            int items = Integer.parseInt(sc.nextLine());

            System.out.println("Average Bill = " + bills[index] / items);

            payBill(5000, 6000);

        } catch (ArithmeticException e) {
            System.out.println("Bills cannot have zero items.");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid patient index.");

        } catch (NumberFormatException e) {
            System.out.println("Please enter valid numeric input.");

        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}