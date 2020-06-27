package lesson15;

public abstract class Musician {

    protected String firstName;
    protected String lastName;

    public Musician(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void play() {
        System.out.println("My name is " + firstName + " " + lastName + " and I can play");
    }









}
