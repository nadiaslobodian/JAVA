package lesson4;

public class Main {
    public static void main(String[] args) {

        Client client1 = new Client("John", "Smitt", 25, true);
        Client client2 = new Client ("Anna", "Sammer", 18, false);

        System.out.println(client1);
        System.out.println(client2);

        System.out.println(client1.firstName + " " + client1.lastName);
        System.out.println(client1.age);
        System.out.println(client1.id);

        System.out.println(client2.firstName + " " + client2.lastName + " " + client2.age + " " + client2.id);

        client1.firstName = "Ivan";
        System.out.println(client1.firstName);






    }
}
