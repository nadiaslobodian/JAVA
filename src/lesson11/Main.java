package lesson11;

public class Main {
    public static void main(String[] args) {

        Client client1 = new Client("Jon", "Smitt", 45, true);
        Client client2 = new Client("Anna", "Jons", 15, false);
        Client client3 = new Client("Ron", "Willson", 21, true);


        Client[] array4 = new Client[3];
        Client[] array5 = {client1, client2, client3};

        array4[0] = client1;
        array4[1] = client2;
        array4[2] = client3;

        Admin admin = new Admin();
        int[] result = admin.check(array4);
        System.out.println(result[0] + " clients allowed to enter");
        System.out.println(result[1] + " clients not allowed to enter");

        System.out.println();

        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};

        admin.checkNumber(array1);














    }
}
