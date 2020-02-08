package metods_Grzesiek.bank;

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




}
