class BankAccount {
    // Fields
    String account_holder_name;
    double balance;

    // Constructor
    BankAccount(String name, double initialBalance) {
        account_holder_name = name;
        balance = initialBalance;
    }

    // Deposit method
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // Withdraw method
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // Check balance method
    void checkBalance() {
        System.out.println("Account Holder: " + account_holder_name);
        System.out.println("Current Balance: " + balance);
    }

    // Main method
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Rahul", 5000);

        account.checkBalance();

        account.deposit(2000);
        account.checkBalance();

        account.withdraw(1500);
        account.checkBalance();

        account.withdraw(7000);
    }
}
