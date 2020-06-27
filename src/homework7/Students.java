package homework7;

public class Students {

    private String firstName;
    private String lastName;
    private int age;
    private int degree;
    private boolean diploma;

    public Students(String firstName, String lastName, int age, int degree, boolean diploma) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.degree = degree;
        this.diploma = diploma;
    }

    public Students(String lastName, int age, int degree, boolean diploma) {
        this.lastName = lastName;
        this.age = age;
        this.degree = degree;
        this.diploma = diploma;
    }

    public Students(String lastName, int degree, boolean diploma) {
        this.lastName = lastName;
        this.degree = degree;
        this.diploma = diploma;
    }

    public Students(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Students(String lastName, int age, int degree) {
        this.lastName = lastName;
        this.age = age;
        this.degree = degree;
    }

    public Students(String lastName, boolean diploma) {
        this.lastName = lastName;
        this.diploma = diploma;
    }

    public int method1(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public int method2(int a, int b) {
        int min = a - b;
        return min;
    }

    public int method3(int a, int b) {
        int mult = a * b;
        return mult;
    }















    }

