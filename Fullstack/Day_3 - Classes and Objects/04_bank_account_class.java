/**
 * 04_bank_account_class.java
 * Class state management with deposit, withdraw, and balance inspection behaviors.
 */
class SimpleAccount {
    String accountNumber;
    String accountHolder;
    double balance;

    void initialize(String accNum, String holder, double initialBalance) {
        accountNumber = accNum;
        accountHolder = holder;
        balance = initialBalance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited ₹" + amount + ". New Balance: ₹" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew ₹" + amount + ". Remaining Balance: ₹" + balance);
        } else {
            System.out.println("Withdrawal failed! Insufficient funds or invalid amount.");
        }
    }

    void displaySummary() {
        System.out.println("Account: " + accountNumber + " | Holder: " + accountHolder + " | Balance: ₹" + balance);
    }
}

class _04_bank_account_class {
    public static void main(String[] args) {
        SimpleAccount acc = new SimpleAccount();
        acc.initialize("ACC99812", "Rohan Verma", 5000.00);

        System.out.println("--- Initial State ---");
        acc.displaySummary();

        System.out.println("\n--- Performing Transactions ---");
        acc.deposit(2500.00);
        acc.withdraw(1200.00);
        acc.withdraw(7000.00); // Exceeds balance
    }
}
