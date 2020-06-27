package homework13;

import java.util.ArrayList;

public class Administrator {

    public void check(ArrayList<Client> clients) {
        for (int i = 0; i < clients.size(); i++)
            if(clients.get(i).getId() == true && clients.get(i).getAge() >= 21) {
                System.out.println(clients.get(i).getFirstName() + " " + clients.get(i).getLastName() + " You are welcome to enter");
            } else {
                System.out.println(clients.get(i).getFirstName() + " " + clients.get(i).getLastName() + " You are not allowed to enter");
            }
    }

    public int[] check1(ArrayList<Client> clients) {
        int[] result = new int[2];
        int enter = 0;
        int notEnter = 0;
        for (int i = 0; i < clients.size(); i++) {
            if (clients.get(i).getId() == true && clients.get(i).getAge() >= 21) {
                enter++;
            } else {
                notEnter++;
            }
        } result[0] = enter;
        result[1] = notEnter;
        return result;
    }



}
