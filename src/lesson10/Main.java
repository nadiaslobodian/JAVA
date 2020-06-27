package lesson10;

public class Main {
    public static void main(String[] args) {

        int[] array = new int[5];

        array[0] = 1;
        array[1] = 2;
        array[2] = 4;
        array[3] = 6;
        array[4] = 3;

//        System.out.println(array.length);
//
//        System.out.println(array[1]);

        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();


        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }

        System.out.println();

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count = count + 1;
            }
        }
        System.out.println(count);

        int count1 = 0;
        int count2 = 0;
        for (int i =0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count1 = count1 + 1;
            } else {
                count2 = count2 + 1;
            }
        }

        if (count1 > count2) {
            System.out.println("More even numbers on " + (count1 - count2));
        } else {
            System.out.println("More odd numbers on " + (count2 - count1));
        }


        int evenSum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenSum = evenSum + array[i];
            }
        }
        System.out.println(evenSum);

        int evenSum1 = 0;
        int oddSum1 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenSum1 = evenSum1 + array[i];
            } else {
                oddSum1 = oddSum1 + array[i];
            }
        }

        if (evenSum1 > oddSum1) {
            System.out.println("Sum of even numbers is bigger than odd for " + (evenSum1 - oddSum1));
        } else {
            System.out.println("Sum of odd numbers is bigger than even for " + (oddSum1 - evenSum1));
        }



















    }
}
