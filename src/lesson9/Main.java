package lesson9;

public class Main {
    public static void main(String[] args) {

        Client client1 = new Client("Kim", "Jons", 35, true);
        Client client2 = new Client("Lee", "Ron", 19, false);

        Admin admin1 = new Admin();

//        admin1.check(client1.getFirstName(), client1.getLastName(), client1.getAge(), client1.getId());
//
//        admin1.check(client2.getFirstName(), client2.getLastName(), client2.getAge(), client2.getId());

        admin1.check1(client1);
        admin1.check1(client2);
























    }



}
