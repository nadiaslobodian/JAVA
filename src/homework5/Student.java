package homework5;

public class Student {

    private String firstName;
    private String lastName;
    private int age;
    private int points;
    private boolean passStatement;

    public Student (String firstName, String lastName, int age, int points, boolean passStatement) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.points = points;
        this.passStatement = passStatement;
    }

    public Student (String lastName, int age, boolean passStatement) {
        this.lastName = lastName;
        this.age = age;
        this.passStatement = passStatement;
    }

    public Student (String lastName, boolean passStatement) {
        this.lastName = lastName;
        this.passStatement = passStatement;
    }

    public Student (String firstName, String lastName, int points) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.points = points;
    }

    public Student (String firstName, String lastName, boolean passStatement) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passStatement = passStatement;
    }

    public Student (String firstName, String lastName, int age, int points) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.points = points;
    }

    public Student (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Student (String lastName, int age, int points, boolean passStatement) {
        this.lastName = lastName;
        this.age = age;
        this.points = points;
        this.passStatement = passStatement;
    }




}
