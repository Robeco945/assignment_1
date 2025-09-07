public class BankAccount {
    // Your variable declarations and code here
    static int totalAccount = 0;
    int accountNumber = 0;
    int balance;
    public BankAccount(int balance){
        this.balance = balance;
        totalAccount += 1;
        this.accountNumber += getTotalAccounts();
    }

    public static int getTotalAccounts(){
        return totalAccount;
    }
    public void deposit(int money){
        balance += money;
    }
    public void withdraw(int money){
        balance -= money;
    }
    public int getAccountNumber(){
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1000);
        BankAccount account2 = new BankAccount(2000);
        BankAccount account3 = new BankAccount(1000000000);

        account1.deposit(500);
        account2.withdraw(800);

        System.out.println("Account " + account1.getAccountNumber() + " balance: " + account1.getBalance());
        System.out.println("Account " + account2.getAccountNumber() + " balance: " + account2.getBalance());
        System.out.println("Account " + account3.getAccountNumber() + " balance: " + account3.getBalance());


        System.out.println("Total number of accounts: " + BankAccount.getTotalAccounts());
    }
}