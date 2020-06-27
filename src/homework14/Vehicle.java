package homework14;

public class Vehicle {

    protected String brand;
    protected int year;
    protected String color;

    public Vehicle(String brand, int year, String color) {
        this.brand = brand;
        this.year = year;
        this.color = color;
    }

    public String getBrand() {return brand;}

    public int getYear() {return year;}

    public String getColor() {return color;}

    public void setColor(String color) {this.color = color;}

    public void start() {
        System.out.println(brand + " engine started");
    }










}
