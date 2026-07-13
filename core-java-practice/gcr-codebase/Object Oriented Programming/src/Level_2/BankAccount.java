package Level_2;

class excep extends Exception {

    public excep(String message) {
        super(message);
    }
}

public class BankAccount {

    private String accountHolder;
    private long accountNumber;
    private int balance;

    BankAccount(String accountHolder, long accountNumber, int balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public String setBalance(int amount, long acc) {

        if (accountNumber == acc) {
            balance += amount;

            return "Amount " + amount +
                    " deposited to a/c: " + acc +
                    " successfully";
        }

        return "Something Went Wrong";
    }

    private String depositMoney(int amount, long acc) {
        String res = setBalance(amount, acc);
        return res;
    }

    private String withdrawMoney(int amount, long acc) throws excep {

        if (acc != accountNumber) {
            return "Unauthorized Access";
        }

        if (balance < amount) {
            throw new excep("Insufficient Balance to withdraw");
        }

        balance -= amount;

        return "Money Withdrawal successful, Current Balance: " + balance;
    }

    public static void main(String[] args) {

        BankAccount acc =
                new BankAccount("Rudra", 2315000796L, 25000);

        try {

            System.out.println(
                    acc.withdrawMoney(20000, acc.getAccountNumber())
            );

            String deposited =
                    acc.depositMoney(1000, acc.getAccountNumber());

            System.out.println(deposited);
            System.out.println("Current Balance: " + acc.getBalance());

        } catch (excep e) {

            System.out.println(e.getMessage());
        }
    }
}