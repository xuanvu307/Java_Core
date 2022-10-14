package lesson6.homework;

import java.util.ArrayList;

public class Series extends Film{
    private int episode;
    private int averageDuration;

    public Series(int episode, int averageDuration) {
        this.episode = episode;
        this.averageDuration = averageDuration;
    }

    public Series(String title, Constant.CATEGORY category, double ranking, int episode, int averageDuration) {
        super(title, category, ranking);
        this.episode = episode;
        this.averageDuration = averageDuration;
    }

    public Series() {

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


}
