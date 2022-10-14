package lesson6.homework;

import java.util.Scanner;

public class SeriesModel extends FilmModel {
    Scanner sc = new Scanner(System.in);
    FilmModel filmModel = new FilmModel();

    public Series inputSeries(){

        Film film = filmModel.inputFilm();
        System.out.println("enter episode: ");
        int episode = sc.nextInt();
        System.out.println("enter averageDuration: ");
        int averageDuration = sc.nextInt();
        Series series = new Series(film,episode ,averageDuration);
        return series;

    }
}
