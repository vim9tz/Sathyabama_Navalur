/**
 * 06_encapsulated_bank_account.java
 * Strict encapsulation with private state, getter/setter validation, and protection against invalid balance mutations.
 */
class SecureBankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public SecureBankAccount(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Warning: Initial balance cannot be negative. Setting balance to 0.0");
            this.balance = 0.0;
        }
    }

    // Getters (Read Access)
    public String getAccountNumber() { return accountNumber; }
    public String getAccountHolder() { return accountHolder; }
    public double getBalance() { return balance; }

    // Controlled Deposit
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposit of ₹" + amount + " successful. Balance: ₹" + this.balance);
        } else {
            System.out.println("Error: Deposit amount must be positive.");
        }
    }

    // Controlled Withdrawal
    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Withdrawal of ₹" + amount + " successful. Balance: ₹" + this.balance);
        } else {
            System.out.println("Error: Insufficient funds or invalid withdrawal amount.");
        }
    }
}

class _06_encapsulated_bank_account {
    public static void main(String[] args) {
        SecureBankAccount account = new SecureBankAccount("SB-90812", "Ananya Sharma", 10000.00);

        System.out.println("--- Encapsulated Bank Account ---");
        System.out.println("Holder: " + account.getAccountHolder() + " | Acc No: " + account.getAccountNumber());
        System.out.println("Initial Balance: ₹" + account.getBalance());

        // Attempting valid and invalid mutations
        account.deposit(3500.00);
        account.withdraw(15000.00); // Invalid withdrawal (exceeds balance)
        account.withdraw(2000.00);  // Valid withdrawal
    }
}
