package lesson5;

public class Cat {

    private String name;
    private int age;
    private String color;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
     public Cat(String name, String color) {
        this.name = name;
        this.color = color;
     }

     public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
     }


}
