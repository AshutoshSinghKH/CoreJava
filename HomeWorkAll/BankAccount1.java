// HW Bank Account
class BankAccount {
   
    private String accountNumber;
    private double balance;

    // Constructor parameterized hai
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getter for accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }
     // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter for accountNumber
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    // Setter for balance
        public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative.");
        }
    }

        public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
}

class BankAccount1 {
    public static void main(String[] args) {
        
        BankAccount account = new BankAccount("45854587445", 200000.0);

        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Initial Balance: " + account.getBalance());

        
        account.deposit(100000.0);
        System.out.println("Balance after deposit: " + account.getBalance());

        
        account.withdraw(200000.0);
        System.out.println("Balance after withdrawal: " + account.getBalance());

        // Attempt to withdraw more than the balance
        account.withdraw(400000.0);

        // Using setter to change account number
        account.setAccountNumber("15544226456");
        System.out.println("Updated Account Number: " + account.getAccountNumber());

        // Using setter to change balance directly (not typical)
        account.setBalance(1500.0);
        System.out.println("Balance after setting new balance: " + account.getBalance());

        // Attempt to set a negative balance
        account.setBalance(-100.0);
    }
}
