package homework15;

import java.util.ArrayList;

public abstract class Animal {

    protected String name;
    protected int age;
    protected boolean wild;

    public Animal(String name, int age, boolean wild) {
        this.name = name;
        this.age = age;
        this.wild = wild;
    }

    public String getName() {return name;}

    public int getAge() {return age;}

    public boolean getWild() {return  wild;}

    public void voice() {
            System.out.println(name + " says ");
    }






}
