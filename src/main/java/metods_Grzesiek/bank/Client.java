package metods_Grzesiek.bank;

import java.util.ArrayList;
import java.util.List;

public class Client {

    private String fistName;
    private String lastName;
    private String pesel;
    private String ID;
    private List<Account> accounts;

    public Client(String fistName, String lastName, String pesel, String ID) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.ID = ID;
        accounts = new ArrayList<>();
    }
    public Client(){

    }

    public Client(String fistName, String lastName, String pesel, String ID, String type) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.ID = ID;
        accounts = new ArrayList<>();
        addAccount(new Account(type,0));
    }


    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }


    public boolean ClientAccountList(Account account) {return accounts.indexOf(account) >= 0;}

    public void addAccount (Account account){
        accounts.add(account);
}

    public boolean removeAccount (Account account){
        if (account.getBalance() == 0){
            System.out.println("Stan środków = 0, usunięcie konta: ");
            return accounts.remove(account);
        }
        System.out.println("Nie można usunąć konta - saldo dodatnie!");
        return false;
}


}
