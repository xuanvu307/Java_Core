package lesson6.homework;

import java.util.Scanner;

public class MovieModel extends FilmModel {
    Scanner sc = new Scanner(System.in);
    FilmModel filmModel = new FilmModel();


    public Movie inputMovie(){

        Film film = filmModel.inputFilm();
        System.out.println("enter duration");
        int duration = sc.nextInt();
        Movie movie = new Movie(film, duration);

        return  movie;
    }


}
