package lesson5;

public class Client {

    private String firstName;
    private String lastName;
    private int age;
    private boolean id;

    public Client(String firstName, String lastName, int age, boolean id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.id = id;
    }

    public Client(String firstName) {
        this.firstName = firstName;
    }

    public Client(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Client(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    public Client(String firstName, String lastName, boolean id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }




}
