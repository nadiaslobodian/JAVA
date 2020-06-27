package homework7;

public class Main {
    public static void main(String[] args) {

        Students students1 = new Students("Josh", "Smitt", 26, 89,true);
        Students students2 = new Students("Long", 68, false);
        Students students3 = new Students("Kim", 42, 99);
        Students students4 = new Students("Anna", "Green");
        Students students5 = new Students("Paul", 68, true);


        int sum1 = students1.method1(2,8);
        System.out.println(sum1);

        int min1 = students2.method2(5,6);
        System.out.println(min1);

        int mult1 = students3.method3(5,5);
        System.out.println(mult1);


























    }






}
