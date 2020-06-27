package lesson8;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Kim", 3, "blue", true);
        Cat cat2 = new Cat("Mimi", 5, "grey", false);

        String name1 = cat1.getName();
        System.out.println(name1);

        int age1 = cat1.getAge();
        System.out.println(age1);

        String color1 = cat1.getColor();
        System.out.println(color1);

        boolean home1 = cat1.getHome();
        System.out.println(home1);

        System.out.println(cat1.getName() + " " + cat1.getAge() + " " + cat1.getColor() + " " + cat1.getHome());

        if(cat1.getAge() > 2) {
            System.out.println(cat1.getName() + " You need vaccine");
        }

        cat1.setName("Vasil");
        System.out.println(cat1.getName());

        if(cat1.getAge() > 2) {
            System.out.println(cat1.getName() + " You need vaccine");
        }

        cat1.setAge(4);
        System.out.println(cat1.getAge());

        cat1.setColor("red");
        System.out.println(cat1.getColor());

        cat1.setHome(false);
        System.out.println(cat1.getHome());

        if(cat2.getHome() == false && cat2.getAge() > 2  ) {
            System.out.println(cat2.getName() + " Need vaccine");
        } else {
            System.out.println(cat2.getName() + " Don't need vaccine");
        }

        cat2.setAge(cat2.getAge() + 1);
        System.out.println(cat2.getAge());

        Dog dog1 = new Dog();
        dog1.setName("Milk");
        dog1.setAge(4);
        dog1.setBread("colli");

        System.out.println(dog1.getName() + " " + dog1.getAge() + " " + dog1.getBread());












    }
}
