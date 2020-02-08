package metods_Grzesiek.bank;

public class BankTest {

    public static void main(String[] args) {

        Client client1 = new Client("Anna", "Kowalska", "589652", "1");
        client1.addAccount(new Account("DEBETOWE", 2000));

        Client client2 = new Client("Adam", "Nowak", "856845",
                "2", "Oszczędnościowe");




    }
}
