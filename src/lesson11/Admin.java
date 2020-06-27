package lesson11;

public class Admin {


    public int[] check(Client[] clients) {
        int allow = 0;
        int notAllow = 0;
        int[] array = new int[2];
        for (int i = 0; i < clients.length; i++) {
            if(clients[i].getId() == true && clients[i].getAge() >= 21)  {
                allow = allow + 1;
                System.out.println(clients[i].getFirstName() + " " + clients[i].getLastName() + " welcome");
            } else {
                notAllow = notAllow + 1;
                System.out.println(clients[i].getFirstName() + " " + clients[i].getLastName() + " go home");
            }
        }
        array[0] = allow;
        array[1] = notAllow;
        return array;
    }

    public void checkNumber(int[] nadia) {
        for(int i = 0; i < nadia.length; i++) {
            if (nadia[i] % 3 == 0 && nadia[i] % 5 ==0) {
                System.out.println("FizzBazz");
            } else
            if (nadia[i] % 3 == 0) {
                System.out.println("Fizz");
            } else
            if (nadia[i] % 5 == 0) {
                System.out.println("Bazz");
            } else {
                System.out.println(nadia[i]);
            }
        }
    }

    // Fizz, Bazz, FizzBazz, number












}
