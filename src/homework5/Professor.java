package homework5;

import javax.management.monitor.StringMonitor;

public class Professor {

    private String title;
    private String majorSpecialization;
    private int courses;
    private String rating;
    private boolean contract;


    public Professor(String title, String majorSpecialization, int courses, String rating, boolean contract) {
        this.title = title;
        this.majorSpecialization = majorSpecialization;
        this.courses = courses;
        this.rating = rating;
        this.contract = contract;
    }

    public Professor(String title, String majorSpecialization, int courses, boolean contract) {
        this.title = title;
        this.majorSpecialization = majorSpecialization;
        this.courses = courses;
        this.contract = contract;
    }

    public Professor(String title, String majorSpecialization, String rating) {
        this.title = title;
        this.majorSpecialization = majorSpecialization;
        this.rating = rating;
    }

    public Professor(String title, String majorSpecialization, int courses) {
        this.title = title;
        this.majorSpecialization = majorSpecialization;
        this.courses = courses;
    }

    public Professor(String title, String majorSpecialization, boolean contract) {
        this.title = title;
        this.majorSpecialization = majorSpecialization;
        this.contract = contract;
    }

    public Professor(String title, String majorSpecialization, String rating, boolean contract) {
        this.title = title;
        this.majorSpecialization = majorSpecialization;
        this.rating = rating;
        this.contract = contract;
    }

    public Professor(String title, String majorSpecialization, int courses, String rating) {
        this.title = title;
        this.majorSpecialization = majorSpecialization;
        this.courses = courses;
        this.rating = rating;
    }

    public Professor(String title, boolean contract) {
        this.title = title;
        this.contract = contract;
    }

    public Professor(String title, int courses, boolean contract) {
        this.title = title;
        this.courses = courses;
        this.contract = contract;
    }

    public Professor(String title, String rating) {
        this.title = title;
        this.rating = rating;
    }






}
