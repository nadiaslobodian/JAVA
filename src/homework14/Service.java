package homework14;

import java.util.ArrayList;

public class Service {

    public void check1(ArrayList<Sedan> sedans) {
        for (int i = 0; i < sedans.size(); i++) {
            System.out.println(sedans.get(i).getBrand() + " " + sedans.get(i).getYear() + " " + sedans.get(i).getColor() + " " + sedans.get(i).getSpeed());
        }
    }

    public void check2(ArrayList<Suv> suv) {
        for (int i = 0; i < suv.size(); i++) {
            System.out.println(suv.get(i).getBrand() + " " + suv.get(i).getYear() + " " + suv.get(i).getColor() + " " + suv.get(i).getAllWheel());
        }
    }

    public void check3(ArrayList<Rvs> rvs) {
        for (int i = 0; i < rvs.size(); i++) {
            System.out.println(rvs.get(i).getBrand() + " " + rvs.get(i).getYear() + " " + rvs.get(i).getColor() + " " + rvs.get(i).getCapacity());
        }
    }

    public void checkMain(ArrayList<Vehicle> vehicles) {
        for (int i = 0; i < vehicles.size(); i++) {
            System.out.println(vehicles.get(i).getBrand() + " " + vehicles.get(i).getYear() + " " + vehicles.get(i).getColor());
        }
    }




}
