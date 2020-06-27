package homework10;

public class Main {
    public static void main(String[] args) {


        Cat cat1 = new Cat("Lory", 4, false);
        Cat cat2 = new Cat("Mimi", 5, true);
        Cat cat3 = new Cat("Jery", 3, false);
        Cat cat4 = new Cat("Tom", 1, true);

        Clinic clinic = new Clinic();

        clinic.check(cat1);
        clinic.check(cat2);
        clinic.check(cat3);
        clinic.check(cat4);









    }








}
