package homework10;

public class Clinic {

    public void check(Cat cat) {
        if (cat.getAge() > 2 && cat.getIndoor() == false) {
            System.out.println(cat.getName() + " needs vaccine");
        } else {
            System.out.println(cat.getName() + " does not need vaccine");
        }
    }













}
