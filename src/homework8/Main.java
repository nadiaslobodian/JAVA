package homework8;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Kim", "Jons", 25,4.3, true);
        Student student2 = new Student("Lee", "Knott", 19, 3.9, false);
        Student student3 = new Student("Mike", "Long", 46, 4.5, true);

        System.out.println(student1.getFirstName() + " " + student1.getLastName() + " is " + student1.getAge() + ".  Her average degree is " + student1.getDegree() + " and second diploma is " + student1.getDiploma());

        System.out.println(student2.getFirstName() + " " + student2.getLastName() + " " + student2.getAge() + " " + student2.getDegree() + " " + student2.getDiploma());

        System.out.println(student3.getFirstName() + " " + student3.getLastName() + " " + student3.getAge());
        System.out.println(student3.getDegree());
        System.out.println(student3.getDiploma());

        student1.setAge(student1.getAge() + 1);
        student1.setDegree(4.9);
        student1.setLastName("Lowell");
        System.out.println(student1.getFirstName() + " " + student1.getLastName() + " " + student1.getAge() + " " + student1.getDegree() + " " + student1.getDiploma());

        student2.setFirstName("Leann");
        student2.setLastName("Rock");
        student2.setAge(26);
        student2.setDegree(2.6);
        System.out.println(student2.getFirstName() + " " + student2.getLastName() + " " + student2.getAge() + " " + student2.getDegree() + " " + student2.getDiploma());

        student3.setDegree(4.9);
        student3.setAge(36);
        System.out.println(student3.getFirstName() + " " + student3.getLastName() + " " + student3.getAge() + " " + student3.getDegree() + " " + student3.getDiploma());

        if(student1.getDegree() < 3.5) {
            System.out.println("Your degree is " + student1.getDegree() + " It's lower than average. You have been expelled");
        } else {
            System.out.println("Your degree is " + student1.getDegree() + ". It's higher than average");
        }

        if(student2.getDegree() < 3.5) {
            System.out.println("Your degree is " + student2.getDegree() + " It's lower than average. You have been expelled");
        } else {
            System.out.println("Your degree is " + student2.getDegree() + ". It's higher than average. You are assigned for the next year");
        }

        if(student3.getDegree() < 3.5) {
            System.out.println("Your degree is " + student3.getDegree() + " It's lower than average. You are expelled");
        } else {
            System.out.println("Your degree is " + student3.getDegree() + ". It's higher than average. Congratulation");
        }






































    }



}
