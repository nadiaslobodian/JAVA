package homework14;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Service service = new Service();

        Sedan sedan1 = new Sedan("Toyota", 2013, "back", 180);
        Sedan sedan2 = new Sedan("Tesla", 2020, "navy", 240);
        Sedan sedan3 = new Sedan("Mercedes", 2016, "orange", 290);

        ArrayList<Sedan> sedans = new ArrayList<>();
        sedans.add(sedan1);
        sedans.add(sedan2);
        sedans.add(sedan3);

        sedan1.start();
        sedan2.start();
        sedan3.start();

        System.out.println();

        service.check1(sedans);

        System.out.println();

        Suv suv1 = new Suv("Audi", 2011, "white", false);
        Suv suv2 = new Suv("Porsche", 2020, "silver", true);
        Suv suv3 = new Suv("Jeep", 2014, "green", true);

        ArrayList<Suv> suv = new ArrayList<>();
        suv.add(suv1);
        suv.add(suv2);
        suv.add(suv3);

        suv1.start();
        suv2.start();
        suv3.start();

        System.out.println();

        service.check2(suv);

        System.out.println();

        Rvs rvs1 = new Rvs("Entegra", 2008, "gold", 6);
        Rvs rvs2 = new Rvs("Coachmen", 2016, "white", 4);
        Rvs rvs3 = new Rvs("Newmar", 2014, "red", 2);

        ArrayList<Rvs> rvs = new ArrayList<>();
        rvs.add(rvs1);
        rvs.add(rvs2);
        rvs.add(rvs3);

        rvs1.start();
        rvs2.start();
        rvs3.start();

        System.out.println();

        service.check3(rvs);

        System.out.println();

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(sedan1);
        vehicles.add(sedan2);
        vehicles.add(sedan3);
        vehicles.add(suv1);
        vehicles.add(suv2);
        vehicles.add(suv3);
        vehicles.add(rvs1);
        vehicles.add(rvs2);
        vehicles.add(rvs3);

        service.checkMain(vehicles);



























    }









}
