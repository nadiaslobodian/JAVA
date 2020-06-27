package homework8;

public class Student {

    private String firstName;
    private String lastName;
    private int age;
    private double degree;
    private boolean diploma;

    public Student(String firstName, String lastName, int age, double degree, boolean diploma) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.degree = degree;
        this.diploma = diploma;
    }

    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public int getAge() {return age;}
    public double getDegree() {return degree;}
    public boolean getDiploma() {return diploma;}

    public void setFirstName(String firstName) {this.firstName = firstName;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    public void setAge(int age) {this.age = age;}
    public void setDegree(double degree) {this.degree = degree;}
    public void setDiploma(boolean diploma) {this.diploma = diploma;}





















}
