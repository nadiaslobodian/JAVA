package homework3;

public class Main {

    public static void main(String[] args) {

        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < 16; i++) {
            if (i % 2 == 0) {
                sumEven = sumEven + i;
            } else {
                sumOdd = sumOdd + i;
            }
        }

        System.out.println(sumEven);
        System.out.println(sumOdd);

        if (sumEven > sumOdd) {
            System.out.println("Sum of the even numbers is bigger than sum of the odd numbers");
            System.out.println(sumEven - sumOdd);
        } else {
            System.out.println("Sum of the odd numbers is bigger than sum of the even numbers");
            System.out.println(sumOdd - sumEven);
        }







    }


}
