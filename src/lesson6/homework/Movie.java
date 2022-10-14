package lesson6.homework;

import java.util.ArrayList;

public class Movie extends Film{
    private int duration;



    public Movie(int duration) {
        this.duration = duration;
    }

    public Movie(String title, Constant.CATEGORY category, double ranking, int duration) {
        super(title, category, ranking);
        this.duration = duration;
    }

    public Movie() {

    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return
                super.toString()+
        "duration = " + duration  ;
    }

}
