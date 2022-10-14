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

        //Nhập 2 bài hát và lưu vào mảng songs
        //in giá trị kiểm tra

        System.out.println("enter song A:");
        Song songA = songModel.inputSong();
        songs.add(songA);

        System.out.println("enter song B: ");
        Song songB = songModel.inputSong();
        songs.add(songB);



        //nhập 1 follower M và lưu vào mảng follower

        System.out.println("enter folower M: ");
        Follower folowerM = folowerModel.inputFolower();
        followers.add(folowerM);


        // Nhập 1 IdolX:
        // Idol sẽ nhận giá trị mảng follower ở trên

        System.out.println("enter Idol X: ");
        Idol idolX = idolModel.inputIdol();
        idolX.setFollowers(followers);
        idols.add(idolX);


        //lưu vào tiktok
        tikTok.setSongs(songs);
        tikTok.setIdols(idols);
        tikToks.add(tikTok);


        //in tất cả thông tin vừa nhập:

        System.out.println("Print information:");
        System.out.println("print songs : \n "+songs.toString()+"\n_______________");
        System.out.println("print follower : "+followers.toString()+"\n_______________");
        System.out.println("print idol : " +idols.toString() + "\n_______________");
        System.out.println("print all from tiktok : "+tikToks.toString());

    }
}
