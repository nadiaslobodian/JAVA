package lesson3;

public class Main {
    public static void main(String[] args) {

        String firstName = "John";
        String lastName = "Smitt";
        int age = 25;
        boolean id = true;

        if (id != true) {
            System.out.println(firstName + " " + lastName + " please go home");
        } else {
            if (age > 21) {
                System.out.println(firstName + " " + lastName + " welcome");
            } else {
                System.out.println(firstName + " " + lastName + " welcome");
            }

        }

        if (id == true || age > 21) {
            System.out.println(firstName + " " + lastName + " welcome");
        }

    }



}
