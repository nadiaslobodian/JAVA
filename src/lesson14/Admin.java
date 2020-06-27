package lesson14;

import java.util.ArrayList;

public class Admin {

    public void checkCat(ArrayList<Cat> cats) {
        for (int i = 0; i < cats.size(); i++) {
            System.out.println(cats.get(i).getName() + " " + cats.get(i).getAge() + " " + cats.get(i).getIndoor());
        }
    }

    public void checkDog(ArrayList<Dog> dogs) {
        for (int i = 0; i < dogs.size(); i++) {
            System.out.println(dogs.get(i).getName() + " " + dogs.get(i).getAge());
        }
    }

    public void info(ArrayList<Animal> animals) {
        for(int i = 0; i < animals.size(); i++) {
            System.out.println(animals.get(i).getName() + " " + animals.get(i).getAge());
        }
    }

    public void fullInfo(ArrayList<Animal> animals) {
        int cats = 0;
        int dogs = 0;
        int mouse = 0;
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i) instanceof Cat) {
                cats++;
            } else
                if (animals.get(i) instanceof Dog) {
                    dogs++;
                } else {
                    mouse++;
                }
        }
        System.out.println(" There are " + cats + " cats" + ", " + dogs + " dogs and " + mouse + " mouse");
    }







}
