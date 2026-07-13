import java.util.*;

public class HospitalBillingSystem {
    private static int[] bills = {500, 1200, 300, 750};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter patient index: ");
            int idx = Integer.parseInt(sc.nextLine());

            System.out.print("Enter number of items in bill: ");
            int items = Integer.parseInt(sc.nextLine());

            int total = bills[idx]; // may throw ArrayIndexOutOfBoundsException
            int perItem = total / items; // may throw ArithmeticException (division by zero)
            System.out.println("Per item cost: " + perItem);

            System.out.print("Enter payment amount: ");
            int payment = Integer.parseInt(sc.nextLine()); // may throw NumberFormatException
            if (payment < total) {
                throw new InsufficientFundsException("Payment failed: insufficient funds");
            }
            System.out.println("Payment accepted. Change: " + (payment - total));

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid patient index: no record found for that patient.");
        } catch (ArithmeticException e) {
            System.out.println("Bill error: number of items cannot be zero.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: please enter numeric values only.");
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}
