package homework11;

public class Station {

    public void check(Cars[] cars) {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getYear() < 1995) {
                cars[i].setColor("red");
                System.out.println(cars[i].getOwner() + " Your car color was changed");
            } else {
                System.out.println(cars[i].getOwner() + " Your car was checked");
            }
        }
    }







}
