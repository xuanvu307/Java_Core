package lesson6.homework;

import java.util.Scanner;

public class SeriesModel extends FilmModel {
    Scanner sc = new Scanner(System.in);

    @Override
    public Film inputFilm() {
        Series series = new Series();
        System.out.println("enter episode :");
        series.setEpisode(sc.nextInt());
        System.out.println("enter average duration");
        series.setAverageDuration(sc.nextInt());
        return super.inputFilm();
    }
}
