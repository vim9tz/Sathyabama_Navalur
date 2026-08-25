/**
 * 11_hierarchical_inheritance.java
 * Demonstrates Hierarchical Inheritance where multiple subclasses inherit from a single superclass.
 */
class BankAccountSuper {
    String accountNumber;
    double balance;

    BankAccountSuper(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayBalance() {
        System.out.println("Acc No: " + accountNumber + " | Current Balance: ₹" + balance);
    }
}

class SavingsAccountChild extends BankAccountSuper {
    double interestRate;

    SavingsAccountChild(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void addInterest() {
        double interest = balance * (interestRate / 100);
        balance += interest;
        System.out.println("Interest Added: ₹" + interest + " | Updated Balance: ₹" + balance);
    }
}

class CheckingAccountChild extends BankAccountSuper {
    double overdraftLimit;

    CheckingAccountChild(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    void withdrawWithOverdraft(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrew ₹" + amount + " | Remaining Balance: ₹" + balance);
        } else {
            System.out.println("Transaction declined! Overdraft limit exceeded.");
        }
    }
}

class _11_hierarchical_inheritance {
    public static void main(String[] args) {
        SavingsAccountChild sa = new SavingsAccountChild("SAV1001", 10000.00, 5.0);
        CheckingAccountChild ca = new CheckingAccountChild("CHK2001", 2000.00, 1000.00);

        System.out.println("--- Savings Account ---");
        sa.displayBalance();
        sa.addInterest();

        System.out.println("\n--- Checking Account ---");
        ca.displayBalance();
        ca.withdrawWithOverdraft(2500.00);
    }
}
