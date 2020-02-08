package metods_Grzesiek.bank;

public class Account extends Client{

    private String type;
    private double balance;

    public Account(String fistName, String lastName, String pesel, String ID, String type, double balance) {
        super(fistName, lastName, pesel, ID);
        this.type = type;
        this.balance = balance;
    }

    public Account(String type, double balance) {
        this.type = type;
        this.balance = balance;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public double transferFrom(double amount){
        if (getBalance()== 0){
            System.out.println("Brak środków na koncie");
        } return getBalance() - amount;
    }
}
