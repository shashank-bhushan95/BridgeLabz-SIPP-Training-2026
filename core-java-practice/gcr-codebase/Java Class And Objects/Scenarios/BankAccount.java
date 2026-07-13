package Scenarios;

public class BankAccount {
    String accountNumber, holder;
    double balance;
    static int totalAccounts;

    BankAccount(String a, String h, double b) {
        accountNumber = a;
        holder = h;
        balance = b;
        totalAccounts++;
    }

    void deposit(double x) {
        balance += x;
    }

    void withdraw(double x) {
        if (balance >= x) balance -= x;
    }

    void getStatement() {
        System.out.println(holder + " " + balance);
    }

    public static void main(String[] args) {
        BankAccount[] a = {new BankAccount("1", "A", 1000), new BankAccount("2", "B", 2000), new BankAccount("3", "C", 3000)};
        for (BankAccount b : a) {
            b.deposit(100);
            b.withdraw(50);
            b.deposit(200);
            b.withdraw(100);
            b.deposit(10);
            b.getStatement();
        }
        System.out.println(totalAccounts);
    }
}
