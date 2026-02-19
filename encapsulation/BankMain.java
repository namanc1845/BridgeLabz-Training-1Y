abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String acc, String name, double balance) {
        this.accountNumber = acc;
        this.holderName = name;
        this.balance = balance;
    }

    public double getBalance() { return balance; }

    public void deposit(double amount) { balance += amount; }

    public void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
    }

    public abstract double calculateInterest();
}

interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(String acc, String name, double balance) {
        super(acc, name, balance);
    }

    public double calculateInterest() {
        return getBalance() * 0.05;
    }

    public void applyForLoan(double amount) {
        System.out.println("Loan Applied: " + amount);
    }

    public boolean calculateLoanEligibility() {
        return getBalance() > 5000;
    }
}

public class BankMain {
    public static void main(String[] args) {
        BankAccount acc = new SavingsAccount("12345", "Ravi", 10000);
        System.out.println("Interest: " + acc.calculateInterest());
    }
}
