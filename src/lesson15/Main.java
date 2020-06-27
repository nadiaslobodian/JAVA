package lesson15;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Musician pianist = new Pianist("Joe", "Black");

        Musician sacsofon = new Saxophonist("Anna", "Smith");

        Musician drums = new Drummer("Peter", "Limer");

        ArrayList<Musician> musicians = new ArrayList<>();
        musicians.add(pianist);
        musicians.add(sacsofon);
        musicians.add(drums);

        for (int i = 0; i < musicians.size(); i++) {
            musicians.get(i).play();
        }




























    }













}
