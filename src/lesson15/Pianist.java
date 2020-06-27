package lesson15;

public class Pianist extends Musician {

    public Pianist(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public void play() {
        System.out.println("My name is " + firstName + " " + lastName + " and I can play piano");
    }






}
