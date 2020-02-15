package metods_Grzesiek.bank;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    static Integer clientNumber = 0;
    static Integer accountNumber = 0;

    String name;
    List<Client> clients;
    List<Account> opts;

    public Bank(String name) {
        this.name = name;
        clients = new ArrayList<>();
        opts = new ArrayList<>();
    }

    public Bank() {

    }

    public String getName() {
        return name;
    }

      public boolean isClientInBank(Client client) {
        return clients.contains(client);
      }

    public List<Client> getClients() {return clients;}


}
