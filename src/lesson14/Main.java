package lesson14;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Kimy", 5, true);
        Cat cat2 = new Cat("Lily", 1, false);
        Cat cat3 = new Cat("Cicilia", 3, true);

        Dog dog1 = new Dog("Lucky", 3, "retriver");
        Dog dog2 = new Dog("Limo", 1, "caucau");
        Dog dog3 = new Dog("Jeck", 7, "haski");

        Mouse mouse1 = new Mouse("Go", 1, "black");
        Mouse mouse2 = new Mouse("Nick", 2, "white");
        Mouse mouse3 = new Mouse("Po", 3, "grey");

        System.out.println(cat1.getName());
        System.out.println(cat3.getIndoor());

        System.out.println(dog2.getName() + " " + dog2.getAge());

        cat3.talk();
        dog2.talk();
        mouse1.talk1("Hope");

        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);

        Admin admin = new Admin();
        admin.checkCat(cats);

        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);

        admin.checkDog(dogs);

        System.out.println();

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(cat1);
        animals.add(cat2);
        animals.add(cat3);
        animals.add(dog1);
        animals.add(dog2);
        animals.add(dog3);
        animals.add(mouse1);
        animals.add(mouse2);
        animals.add(mouse3);

        admin.info(animals);

        System.out.println();

        admin.fullInfo(animals);















    }






}
