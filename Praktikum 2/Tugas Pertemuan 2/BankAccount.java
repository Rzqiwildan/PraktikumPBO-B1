public class BankAccount {
    private double balance;

    public BankAccount() {
        balance = 1000;
    }

    public double deposit(double uang) {
        if (uang > 0) {
            balance += uang;
        }
        return uang;
    }

    public double withdraw(double uang) {
        if (uang > 0 && uang <= balance) {
            balance -= uang;
        }
        return uang;
    }

    public double getBalance() {
        return balance;
    }
}
