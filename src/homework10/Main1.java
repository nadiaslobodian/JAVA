package homework10;

public class Main1 {
    public static void main(String[] args) {

        int[] array = new int[7];

        array[0] = -6;
        array[1] = -2;
        array[2] = 3;
        array[3] = 5;
        array[4] = -4;
        array[5] = 1;
        array[6] = 2;


        int positive = 0;
        int negative = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                positive = positive + 1;
            } else {
                negative = negative + 1;
            }
        }

        if(positive > negative) {
            System.out.println("There are more positive numbers than negative");
        } else {
            System.out.println("There are more negative numbers than positive");
        }

        int sumPositive = 0;
        int sumNegative = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                sumPositive = sumPositive + array[i];
            } else {
                sumNegative = sumNegative + array[i];
            }
        }
        System.out.println(sumPositive);
        System.out.println(sumNegative);
















    }
}
