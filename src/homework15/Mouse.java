package homework15;

import java.util.ArrayList;

public class Mouse extends Animal {

    public Mouse(String name, int age, boolean wild) {
        super(name, age, wild);
    }

    @Override
    public void voice() {
            System.out.println(name + " says squeek");
    }








}
