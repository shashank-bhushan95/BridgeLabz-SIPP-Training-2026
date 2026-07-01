import java.util.Scanner;

// Custom Exception
class InsufficientBalanceException extends Exception {

    InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {

    private double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    // Withdraw Method
    void withdraw(double amount)
            throws InsufficientBalanceException, IllegalArgumentException {

        if (amount < 0) {
            throw new IllegalArgumentException("Invalid amount!");
        }

        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }

        balance -= amount;
        System.out.println("Withdrawal successful, new balance: " + balance);
    }
}

public class BankTransactionSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Initial Balance
        BankAccount account = new BankAccount(10000);

        System.out.print("Enter withdrawal amount: ");
        double amount = sc.nextDouble();

        try {

            account.withdraw(amount);

        } catch (InsufficientBalanceException e) {

            System.out.println(e.getMessage());

        } catch (IllegalArgumentException e) {

            System.out.println(e.getMessage());
        }
    }
}