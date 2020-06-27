package homework15;

        import java.util.ArrayList;

public class Dog extends Animal {

    public Dog(String name, int age, boolean wild) {
        super(name, age, wild);
    }

    @Override
    public void voice() {
            System.out.println(name + " says woof");
    }




}
