package lesson7;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Josh", "Kim");

        person1.sum1(6, 3);


        int res1 = person1.sum2(5,2);
        System.out.println(res1);

        String res4 = person1.method1("Hi", "Alex");
        System.out.println(res4);

        String result1 = person1.method2(9);
        System.out.println(result1);

        boolean result7 = person1.method3(8);
        System.out.println(result7);

        int result6 = person1.method4(60, 56);
        System.out.println(result6);

        String result8 = person1.method5(9);
        System.out.println(result8);



        boolean res6 = person1.method6(15);
        System.out.println(res6);

        int res7 = person1.method7(21);
        System.out.println(res7);

        String res8 = person1.method8(23);
        System.out.println(res8);







    }
}
