package metods_Grzesiek.bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    String name;
    List<Client> clients;
    List<Account> opts;

    public Bank(String name) {
        this.name = name;
        clients = new ArrayList<>();
        opts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

      public boolean isClientInBank(Client client) {
        return clients.indexOf(client) >= 0;
      }

   public boolean addClientToBank(Client client){
        if (isClientInBank(client)){
            System.out.println("Osoba " + client.getFistName() + " " + client.getLastName()
            + " jest już klientem banku");
            return false;
        }
       System.out.println("Klient " + client.getFistName() + " " + client.getLastName()
               + " został dodany do Banku");
        return clients.add(client);
   }

    public List<Client> getClients() {return clients;}

    public boolean removeClient(Client client) {
        if (!isClientInBank(client)){
            System.out.println("Nie ma takiego klienta w banku");
            return false;
        }
        System.out.println("Klient " + client.getFistName() + " " + client.getLastName()
        + " został usunięty z listy klientów banku. ");
        return clients.remove(client);
    }
}
