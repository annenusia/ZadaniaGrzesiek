package metods_Grzesiek.bank;

public class BankTest {

    public static void main(String[] args) {

        Client client1 = new Client("Anna", "Kowalska", "589652", "1");
        Bank bank1 = new Bank();
        bank1.addAccount(client1, AccountType.CURRENT);

        Client client2 = new Client("Adam", "Nowak", "856845",
                "2", AccountType.SAVINGS);




    }
}
