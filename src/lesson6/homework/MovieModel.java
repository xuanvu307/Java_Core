package lesson6.homework;

import java.util.Scanner;

public class MovieModel extends FilmModel {
    Scanner sc = new Scanner(System.in);

    @Override
    public Film inputFilm() {
        Movie movie = new Movie();
        System.out.println("enter duration");
        movie.setDuration(sc.nextInt());
        return super.inputFilm();
    }

}
