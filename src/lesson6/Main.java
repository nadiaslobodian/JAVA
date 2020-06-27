package lesson6;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Jery", 3);
        Cat cat2 = new Cat("Murzik", 1);

        cat1.greeting();

        cat1.intro();
        cat2.intro();
        cat2.sum1();

        cat1.sum2(5,6);
        cat2.sum2(894458, 56799912);

        cat1.greeting1("Alex");

        cat2.max(25,65);
        cat1.isEven(16);

        cat1.algorithm(15);






    }


}
