package homework13;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Administrator administrator = new Administrator();

        Client client1 = new Client("Ron", "Red", 26, true);
        Client client2 = new Client("Rolland", "Newman", 16, false);
        Client client3 = new Client("Kim", "Johnson", 21, false);
        Client client4 = new Client("Oliver", "Rodgers", 21, true);
        Client client5 = new Client("Nat", "Lord", 28, true);

        ArrayList<Client> clients = new ArrayList<>();

        clients.add(client1);
        clients.add(client2);
        clients.add(client3);
        clients.add(client4);
        clients.add(client5);

        administrator.check(clients);

        System.out.println();

        int[] result = administrator.check1(clients);
        System.out.println("Clients not allowed to enter " + result[1]);
        System.out.println("Clients allowed to enter " + result[0]);















    }
}
