package homework11;

import homework9.Car;

public class Main {
    public static void main(String[] args) {

        Cars cars1 = new Cars("Toyota", 2020, "green", "Ron Paul");
        Cars cars2 = new Cars("BMW", 1993, "orange", "Add Adams");
        Cars cars3 = new Cars("Mercedes", 1992, "silver", "Mike Kerner");
        Cars cars4 = new Cars("Audi", 2009, "blue", "Rid Scott");
        Cars cars5 = new Cars("Reno", 1991, "black", "Kim Yard");

        Cars[] cars = {cars1, cars2, cars3, cars4, cars5};
        Station station = new Station();

        station.check(cars);

        System.out.println(cars[0].getColor());
        System.out.println(cars[1].getColor());
        System.out.println(cars[2].getColor());
        System.out.println(cars[3].getColor());
        System.out.println(cars[4].getColor());

        System.out.println();

        Applicants applicants1 = new Applicants("Lory", "Rino", 5, true);
        Applicants applicants2 = new Applicants("Gary", "Romney", 2, true);
        Applicants applicants3 = new Applicants("Maria", "Lopez", 4, false);
        Applicants applicants4 = new Applicants("Kim", "King", 1, false);
        Applicants applicants5 = new Applicants("Michelle", "Garrett", 7, true);

        Applicants[] applicants = {applicants1, applicants2, applicants3, applicants4, applicants5};

        Empoyer empoyer = new Empoyer();

        empoyer.check(applicants);

















    }
}
