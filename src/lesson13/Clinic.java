package lesson13;

import java.util.ArrayList;

public class Clinic {

    public void check(ArrayList<Cat> cats) {
        for (int i = 0; i < cats.size(); i++) {
            if (cats.get(i).getAge() >= 2 ) {
                System.out.println(cats.get(i).getName() + " needs vaccine");
            } else {
                System.out.println(cats.get(i).getName() + " is healthy");
            }
        }
    }



}
