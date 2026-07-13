public class ATMWithdrawalSystem {
    public static void main(String[] args) {
        double balance = 5000.0;
        double request = 8000.0;
        try {
            withdraw(balance, request);
        } catch (InsufficientBalanceException e) {
            System.out.println("Handled at caller: " + e.getMessage());
            System.out.println("Requested: " + request + ", Available: " + balance);
        }
    }

    static void withdraw(double balance, double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Withdrawal denied: insufficient balance");
        }
        System.out.println("Dispensing: " + amount);
    }
}
