package homework4;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Moon", "grey", "male", 3, true);
        System.out.println(cat1.name);

        Cat cat2 = new Cat("Sun", "white", "female", 2, false);
        cat2.color = "red";
        System.out.println(cat2.name + " is " + cat2.color);

        Cat cat3 = new Cat("Oreo", "black&white", "male", 5, true);
        System.out.println(cat3.name + " " + cat3.sex);

        Cat cat4 = new Cat("Red", "red", "male", 6, true);
        System.out.println(cat4.name + " is " + cat4.age);

        Dog dog1 = new Dog("Charm", "shepherd dog", "big", true, true);
        System.out.println(dog1.nickname + " is " + dog1.breed);

        Dog dog2 = new Dog("Lady", "spaniel", "smal", true, false);
        System.out.println(dog2.nickname);

        Dog dog3 = new Dog("Jeck", "terrier", "medium", false, true);
        dog3.size = "big";
        System.out.println(dog3.nickname + " is " + dog3.size);

        Dog dog4 = new Dog("Rose", "retriver", "smal", false, false);
        System.out.println(dog4.nickname + " is " + dog4.size + " " + dog4.breed);

        Rabbit rabbit1 = new Rabbit("Lol", "high", "brown", true, 6);
        System.out.println(rabbit1.call + " is " + rabbit1.fur + " rabbit and can jump " + rabbit1.jump + " and have medium speed " + rabbit1.speed);

        Rabbit rabbit2 = new Rabbit("JJ", "far", "white", false, 10);
        System.out.println(rabbit2.call + " has max speed " + rabbit2.speed);





    }


}
