package homework9;

public class Mechanic {

    public void check(Car car) {
        if(car.getYear() < 2000) {
            car.setColor("red");
            System.out.println(car.getOwner() + " Your car was painted in red");
        } else {
            System.out.println(car.getOwner() + " Your car was checked");
        }
    }

    public void check1(String brand, int year, String color, String owner) {
        if (year < 2000) {
            color = "red";
            System.out.println(owner + " Your car was painted in red");
        } else {
            System.out.println(owner + " Your car was checked");
        }
    }










}
