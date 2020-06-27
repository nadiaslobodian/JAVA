package homework9;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Toyota", 2010, "green", "Adam Jones");
        Car car2 = new Car("BMW", 1996, "orange", "Anna Adams");
        Car car3 = new Car("Mercedes", 1992, "silver", "Mike Kiner");
        Car car4 = new Car("Tesla", 2019, "blue", "Nadia Slobodian");

        Mechanic mechanic = new Mechanic();
//        mechanic.check(car1);
////        mechanic.check(car2);
////        mechanic.check(car3);
////        mechanic.check(car4);
////
////        System.out.println();
////
////        mechanic.check1(car1.getBrand(), car1.getYear(), car1.getColor(), car1.getOwner());
////        mechanic.check1(car2.getBrand(), car2.getYear(), car2.getColor(), car2.getOwner());
////        mechanic.check1(car3.getBrand(), car3.getYear(), car3.getColor(), car3.getOwner());
////        mechanic.check1(car4.getBrand(), car4.getYear(), car4.getColor(), car4.getOwner());

        mechanic.check1(car2.getBrand(), car2.getYear(), car2.getColor(), car2.getOwner());
        System.out.println(car2.getColor());

























    }
}
