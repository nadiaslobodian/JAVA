package lesson3;

public class Main2 {
    public static void main(String[] args) {

        for (int i = 0; i < 2; i++) {
            System.out.println("Hello World");
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        int count = 0;

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                count = count + 1;
            }
        }
        System.out.println(count);

        System.out.println();

        int sum = 0;

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);







    }


}
