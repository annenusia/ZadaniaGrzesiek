package metods_Grzesiek.bank;

import java.util.Objects;

public class Account extends Client{

    private String accountNumber;
    private double balance;
    private AccountType accountType;

    public Account(String fistName, String lastName, String pesel, String ID,
                   String accountNumber, double balance) {
        super(fistName, lastName, pesel, ID);
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public Account(String accountNumber) {
        this.accountType = accountType;
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double transferTo(double amount){
        return getBalance() + amount;
    }

    public void deposit(int amount) {
        this.balance += amount;
        System.out.println("Wpłata na rachunek " + this.accountNumber
                + " zaksięgowana.");
    }

    public boolean withdraw(int amount) {
        if(this.balance < amount) {
            System.out.println("Stan konta " + this.accountNumber
                    + " mniejszy niż żądana kwota : " + amount);
            return false;
        }
        this.balance -= amount;
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Account account = (Account) o;
        return Objects.equals(accountNumber, account.accountNumber);
    }

    @Override
    public int hashCode() {

        return Objects.hash(accountNumber);
    }

}
