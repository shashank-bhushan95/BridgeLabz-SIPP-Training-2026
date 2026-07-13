import java.util.*;

public class Problem10_BankTransactionSystem {
    static class BankAccount {
        private double balance;

        public BankAccount(double balance) {
            this.balance = balance;
        }

        public void withdraw(double amount) throws InsufficientBalanceException, InvalidAmountException {
            if (amount < 0) {
                throw new InvalidAmountException("Invalid amount!");
            }
            if (amount > balance) {
                throw new InsufficientBalanceException("Insufficient balance!");
            }
            balance -= amount;
            System.out.println("Withdrawal successful, new balance: " + balance);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount acc = new BankAccount(1000.0);
        System.out.print("Enter withdrawal amount: ");
        try {
            double amt = sc.nextDouble();
            acc.withdraw(amt);
        } catch (InvalidAmountException e) {
            System.out.println("Invalid amount!");
        } catch (InsufficientBalanceException e) {
            System.out.println("Insufficient balance!");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
        } finally {
            sc.close();
        }
    }
}
