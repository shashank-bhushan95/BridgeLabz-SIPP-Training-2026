import java.util.Scanner;

class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class ATMWithdrawalSystem {

    static void withdraw(double balance, double amount)
            throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient Balance!");
        }

        balance -= amount;

        System.out.println("Withdrawal Successful");
        System.out.println("Remaining Balance = ₹" + balance);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 5000;

        System.out.print("Enter Withdrawal Amount: ");
        double amount = sc.nextDouble();

        try {

            withdraw(balance, amount);

        } catch (InsufficientBalanceException e) {

            System.out.println(e.getMessage());
        }
    }
}