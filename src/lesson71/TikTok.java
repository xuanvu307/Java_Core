package lesson71;

import java.util.ArrayList;

public class TikTok {
    private ArrayList<Song> songs;
    private ArrayList<Idol> idols;

    public TikTok() {
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<Song> songs) {
        this.songs = songs;
    }

    public ArrayList<Idol> getIdols() {
        return idols;
    }

    public void setIdols(ArrayList<Idol> idols) {
        this.idols = idols;
    }

    @Override
    public String toString() {
        return "TikTok{" +
                "songs=" + songs +
                ", idols=" + idols +
                '}';
    }
}
