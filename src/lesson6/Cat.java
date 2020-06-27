package lesson6;

public class Cat {

    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void greeting() {
        System.out.println("Hello Nadia");
    }

    public void greeting1(String userName) {
        System.out.println("Hello " + userName);
    }

    public void intro() {
        System.out.println("Hello. My name is " + name + " my age is " + age);
    }

    public void sum1() {
        System.out.println(2 + 2);
    }

    public void sum2(int a, int b) {
        System.out.println(a + b);
    }

    public void max(int a, int b) {
        if (a > b) {
            System.out.println(a + " is bigger than " + b);
        } else {
            if (b > a) {
                System.out.println(b + " is bigger than " + a);
            } else {
                System.out.println(a + " equal " + b);
            }
        }
    }

    public void isEven(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }

    }

    public void algorithm(int x) {
        if (x % 3 == 0 && x % 5 == 0) {
            System.out.println("Hi. Hello");
        } else
            if (x % 5 == 0) {
            System.out.println("Hello");
        } else
            if (x % 3 == 0) {
            System.out.println("Hi");
        } else {
                System.out.println("Java");
            }
        }












}
