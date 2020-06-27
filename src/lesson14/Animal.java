package lesson14;

import java.util.ArrayList;

public class Animal {

    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {return name;}

    public int getAge() {return age;}

    public void talk() {
        System.out.println("Hi my name is " + name);
    }

    public void talk1(String myName) {
        System.out.println("Hi " + myName + " my name is " + name);
    }












}
