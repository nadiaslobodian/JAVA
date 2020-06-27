package homework15;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Animal cat = new Cat("Lily", 1, false);
        Animal dog = new Dog("Lucky", 3, false);
        Animal mouse = new Mouse("Jerry", 3, true);

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);
        animals.add(mouse);

        for (int i = 0; i < animals.size(); i++) {
            animals.get(i).voice();
        }



















    }
}
