package lesson7;

public class Person {

    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void sum1(int a, int b) {
        int x = a + b;
        System.out.println(x);
    }

    public int sum2(int a, int b) {
        int x = a + b;
        return x;
    }

    public String method1(String a, String b) {
        String x = a + " " + b;
        return x;
    }

    public String method2(int a) {
        String result;
        if (a > 0) {
            result = "Positive";
        } else {
            result = "Negative";
        }
        return result;
    }

    public boolean method3(int b) {
        boolean result1;
        if (b % 2 == 0) {
            result1 = true;
        } else {
            result1 = false;
        }
        return result1;
    }

    public int method4(int a, int b) {
        int result2;
        if(a + b > 100) {
            result2 = 1;
        } else {
            result2 = 0;
        }
        return result2;
    }

    public String method5(int a) {
        String result3;
        if( a % 3 == 0) {
            result3 = "Hello";
        } else {
            result3 = "Hi";
        }
        return result3;
    }



    public boolean method6(int a) {
        boolean result4;
        if(a % 5 == 0) {
            result4 = true;
        } else {
            result4 = false;
        }
        return result4;
    }

    public int method7(int a) {
        int result5;
        if(a % 5 == 0) {
            result5 = 1;
        } else {
            result5 = 0;
        }
        return result5;
    }

    public String method8(int a) {
        String result6;
        if(a % 5 == 0) {
            result6 = "Can be divided";
        } else {
            result6 = "Can't be divided";
        }
        return result6;
    }
















}
