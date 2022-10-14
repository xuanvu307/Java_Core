package lesson6.homework;

import java.util.ArrayList;

public class Series extends Film{
    private int episode;
    private int averageDuration;

    public Series() {
    }

    public Series(int episode, int averageDuration) {
        this.episode = episode;
        this.averageDuration = averageDuration;
    }

    public Series(String id, String title, Constant.CATEGORY category, double ranking, int episode, int averageDuration) {
        super(id, title, category, ranking);
        this.episode = episode;
        this.averageDuration = averageDuration;
    }


    public Series(Film film, int episode, int averageDuration) {
        super(film.getId(), film.getTitle(), film.getCategory(), film.getRanking());
        this.episode = episode;
        this.averageDuration = averageDuration;
    }


    public int getEpisode() {
        return episode;
    }

    public void setEpisode(int episode) {
        this.episode = episode;
    }

    public int getAverageDuration() {
        return averageDuration;
    }

    public void setAverageDuration(int averageDuration) {
        this.averageDuration = averageDuration;
    }


    @Override
    public String toString() {
        return super.toString() +
                ", episode = " + episode +
                ", averageDuration = " + averageDuration ;
    }
}
