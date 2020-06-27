package lesson13;

import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Lily", 5);
        Cat cat2 = new Cat("Po", 1);
        Cat cat3 = new Cat("Imka", 3);
        Cat cat4 = new Cat("Tom", 0);
        Cat cat5 = new Cat("Black", 2);

        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        cats.add(cat5);

        for (int i = 0; i < cats.size(); i++) {
            System.out.print(cats.get(i).getName() + " ");
        }
        System.out.println();

        Clinic clinic = new Clinic();

        clinic.check(cats);

        








    }
}
