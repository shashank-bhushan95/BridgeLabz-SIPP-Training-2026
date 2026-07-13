import java.util.*;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class BankTransactionSystem {

    int currentBalance = 12;
    private void depositAmount(double amount) throws IllegalArgumentException {
        if( amount < 0){
            throw new IllegalArgumentException("Invalid Amount");
        }
        if (currentBalance > 0){
            currentBalance += amount;
            System.out.println("Amount Deposited Successfully" + "\nCurrent Balance: " +currentBalance);
        }
    } 

    private void withDraw(double amount) throws InsufficientBalanceException {

        if (amount < 0) {
            throw new IllegalArgumentException("Invalid Amount");
        }

        if (currentBalance >= amount) {
            currentBalance -= amount;
            System.out.println("Withdrawal successful. \n Remaining Balance: " + currentBalance);
        } else {
            throw new InsufficientBalanceException("Insufficient balance\n please try again by entering valid amount");
        }
    }

    public static void main(String[] args) {

        BankTransactionSystem bts = new BankTransactionSystem();
        Scanner sc = new Scanner(System.in);
        while (true) {
        System.out.println("Select Function: ");
        System.out.print("1) Deposit \n 2) Withdraw \n>>>");
        int func = sc.nextInt();
        try {
            switch (func) {
                case 1:
                    System.out.print("Enter Amount to Deposit: $");
                    int amp = sc.nextInt();
                    bts.depositAmount(amp);
                    break;
                case 2:
                    System.out.print("Enter Amount to withdraw: $");
                    int amp2 = sc.nextInt();
                    bts.withDraw(amp2);
                    break;
                default:
                    break;
            }
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }finally {
             System.out.println("Thank You!");
        }
    }
    }
}