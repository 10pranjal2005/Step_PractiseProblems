public class BankAccount {
    private static String bankName;
    private static int totalAccounts;
    private static double interestRate;

    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        totalAccounts++;
    }

    public static void setBankName(String name) { bankName = name; }
    public static void setInterestRate(double rate) { interestRate = rate; }
    public static int getTotalAccounts() { return totalAccounts; }
    public static void displayBankInfo() {
        System.out.println("Bank: " + bankName + ", Accounts: " + totalAccounts);
    }

    public void deposit(double amount) { balance += amount; }
    public void withdraw(double amount) { if (balance >= amount) balance -= amount; }
    public double calculateInterest() { return balance * interestRate / 100; }
    public void displayAccountInfo() {
        System.out.println(accountHolder + " (" + accountNumber + ") Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount.setBankName("ABC Bank");
        BankAccount.setInterestRate(5.0);

        BankAccount acc1 = new BankAccount("A1001", "John", 1000);
        BankAccount acc2 = new BankAccount("A1002", "Mary", 2000);

        acc1.deposit(500);
        acc1.displayAccountInfo();
        acc2.displayAccountInfo();

        BankAccount.displayBankInfo();
        System.out.println("Interest for John: " + acc1.calculateInterest());
    }
}
