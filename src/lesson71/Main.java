package lesson71;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // các mảng lưu trữ
        ArrayList<Song> songs = new ArrayList<>();
        ArrayList<Follower> followers = new ArrayList<>();
        ArrayList<Idol> idols =new ArrayList<>();
        ArrayList<TikTok> tikToks = new ArrayList<>();

        SongModel songModel = new SongModel();
        IdolModel idolModel = new IdolModel();
        FolowerModel folowerModel = new FolowerModel();
        TikTok tikTok = new TikTok();

        //Nhập 2 bài hát:

        System.out.println("enter song A:");
        Song songA = songModel.inputSong();
        songs.add(songA);
        System.out.println(songA);

        System.out.println("enter song B: ");
        Song songB = songModel.inputSong();
        songs.add(songB);
        System.out.println(songB);
        System.out.println(songs.toString());


        //nhập 1 follower:
        System.out.println("enter folower M: ");
        Follower folowerModelM = folowerModel.inputFolower();
        followers.add(folowerModelM);

        System.out.println(folowerModelM);
        System.out.println(followers.toString());

        // Nhập 1 Idol:

        System.out.println("enter Idol X: ");
        Idol idolX = idolModel.inputIdol();
        idolX.setFollowers(followers);
        idols.add(idolX);

        System.out.println(idols.toString());

        //lưu vào tiktok
        tikTok.setSongs(songs);
        tikTok.setIdols(idols);

        System.out.println(tikTok.toString());

    }
}
