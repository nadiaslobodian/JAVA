package lesson9;

public class Admin {

    public void check(String firstName, String lastName, int age, boolean id) {
        if(id == true && age > 21) {
            System.out.println(firstName + " " + lastName + " Welcome");
        } else {
            System.out.println(firstName + " " + lastName + " Go home");
        }
    }

    public void check1(Client client) {
        if(client.getId() == true && client.getAge() > 21) {
            System.out.println(client.getFirstName() + " " + client.getLastName() + " Welcome");
        } else {
            System.out.println(client.getFirstName() + " " + client.getLastName() + " Go home");
        }
    }













}
