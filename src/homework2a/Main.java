package homework2a;

public class Main {
    public static void main(String[] args) {

        String firstName = "Alex";
        String lastName = "Noll";
        int age = 30;

        String firstName1 = "Michelle";
        String lastName1 = "Adams";
        int age1 = 16;

        String firstName2 = "Lana";
        String lastName2 = "Jons";
        int age2 = 20;

        String firstName3 = "Edouard ";
        String lastName3 = "Ron";
        int age3 = 17;

        if (age > 18) {
            System.out.println(firstName + " " + lastName + " please start the test");
        } else {
            System.out.println(firstName + " " + lastName + " you can't start the test if you don't have the legal age");
        }

        if (age1 > 18) {
            System.out.println(firstName1 + " " + lastName1 + " please start the test");
        } else {
            System.out.println(firstName1 + " " + lastName1 + " you can't start the test if you don't have the legal age");
        }

        if (age2 > 18) {
            System.out.println(firstName2 + " " + lastName2 + " please start the test");
        } else {
            System.out.println(firstName2 + " " + lastName2 + " you can't start the test if you don't have the legal age");
        }

        System.out.println(" ");

        if (age3 > 18) {
            System.out.println(firstName3 + lastName3 + " please start the test");
        } else {
            System.out.println(firstName3 + lastName3 + " you can't start the test if you don't have the legal age");
        }





    }






}
