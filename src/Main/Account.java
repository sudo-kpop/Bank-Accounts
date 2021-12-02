package Main;

public class Account {
    private int accountNumber;
    private Customer customer;
    private String accountType;
    private int balance;


    public Account(int accountNumber, String accountType, int balance){
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }
    public int withdraw(int amount){
        return balance -= amount;
    }

    public int deposit(int amount){
        return balance += amount;
    }

    public void transfer(int amount, Account account){
        balance -= amount;
        account.deposit(amount);
    }


    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "Account: " + accountNumber +
                ", Type: " + accountType +
                ", Balance: $" + balance +
                '.';
    }
}
