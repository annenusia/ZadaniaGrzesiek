package metods_Grzesiek.bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

    public Client(String fistName, String lastName, String pesel, String ID, AccountType accountType) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.ID = ID;
        accounts = new ArrayList<>();
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

    public List<Account> getAccounts() {
        return accounts;
    }

    public boolean ClientAccountList(Account account) {return accounts.indexOf(account) >= 0;}

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
       Client client = (Client) o;
        return Objects.equals(fistName, client.fistName) &&
                Objects.equals(lastName, client.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fistName, lastName);
    }

    @Override
    public String toString() {
        return "name='" + fistName + '\'' +
                ", surname='" + lastName;
    }


}
