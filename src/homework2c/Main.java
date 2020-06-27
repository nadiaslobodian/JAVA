package homework2c;

public class Main {
    public static void main(String[] args) {

        String name = "Kelly ";
        String surname = "Long";
        int age = 20;
        int income = 35000;
        int rating = 700;

        String name1 = "Ronda ";
        String surname1 = "Merick";
        int age1 = 45;
        int income1 = 35000;
        int rating1 = 750;

        String name2 = "Josh ";
        String surname2 = "Lovell";
        int age2 = 35;
        int income2 = 28000;
        int rating2 = 640;

        String name3 = "Peter ";
        String surname3 = "King";
        int age3 = 56;
        int income3 = 160000;
        int rating3 = 780;


        if (age >= 21 && income >= 30000 && rating > 699) {
            System.out.println(name + surname + " you were approved for the credit. Congratulations!");
        } else {
            System.out.println(name + surname + " sorry, but we can't approve your credit at the moment");
        }

        if (age1 >= 21 && income1 >= 30000 && rating1 > 699) {
            System.out.println(name1 + surname1 + " you were approved for the credit. Congratulation");
        } else {
            System.out.println(name1 + surname1 + " sorry, but we can't approve your credit at the moment");
        }

        if (age2 >= 21 && income2 >= 30000 && rating > 699) {
            System.out.println(name2 + surname2 + " you were approved for the credit. Congratulations!");
        } else {
            System.out.println(name2 + surname2 + " sorry, but we can't approve your credit at the moment");
        }

        if (age3 >= 21 && income3 >= 30000 && rating > 699) {
            System.out.println(name3 + surname3 + " you were approved for the credit. Congratulations!");
        } else {
            System.out.println(name3 + surname3 + " sorry, but we can't approve your credit at the moment");
        }







    }




}
