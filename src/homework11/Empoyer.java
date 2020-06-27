package homework11;

public class Empoyer {

    public void check(Applicants[] applicants) {
        for (int i = 0; i < applicants.length; i++) {
            if(applicants[i].getExperience() > 3 && applicants[i].getDiploma() == true) {
                System.out.println(applicants[i].getFirstName() + " " + applicants[i].getLastName() + " You are qualified for this job. Congratulations");
            } else {
                System.out.println(applicants[i].getFirstName() + " " + applicants[i].getLastName() + " Sorry, but you are not qualified");
            }
        }
    }




}
