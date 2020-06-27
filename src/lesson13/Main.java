package lesson13;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> array1 = new ArrayList<>();

        array1.add(7);
        array1.add(8);
        array1.add(4);
        array1.add(2);
        array1.add(5);

        System.out.println(array1.size());
        System.out.println(array1.get(3));

        for (int i = 0; i < array1.size(); i++) {
            System.out.print(array1.get(i) + " ");
        }

        System.out.println();

        for (int i = 0; i < array1.size(); i++) {
            if (array1.get(i) % 2 == 0) {
                System.out.print(array1.get(i) + " ");
            }
        }

        System.out.println();

        int even = 0;
        int odd = 0;

        for (int i = 0; i < array1.size(); i++) {
            if (array1.get(i) % 2 == 0) {
                even = even + 1;
            } else {
                odd = odd + 1;
            }
        }

        if (even > odd) {
            System.out.println("Even numbers are more than odd");
        } else {
            System.out.println("Odd numbers  are more than even");
        }

        System.out.println();

        ArrayList<String> array2 = new ArrayList<>();

        array2.add("Ivan");
        array2.add("Anna");
        array2.add("Lorry");
        array2.add("Peter");
        array2.add("Noel");
        array2.add("Anna");

        for (int i = 0; i < array2.size(); i++) {
            System.out.print(array2.get(i) + " ");
        }
        System.out.println();
        int anna = 0;
        int peter = 0;

        for(int i = 0; i < array2.size(); i++) {
            if (array2.get(i).equals("Anna") ) {
                anna++;
            } else {
                if (array2.get(i).equals("Peter")) {
                    peter++;
                }
            }
        }
        if (anna > peter) {
            System.out.println("Anna names are more");
        } else {
            System.out.println("Peter names are more");
        }





















    }
}
