package lesson71;

import java.util.Scanner;

public class SongModel {
    Scanner sc = new Scanner(System.in);
    public Song inputSong(){
        Song song = new Song();
        System.out.println("id: ");
        song.setId(sc.nextLine());
        System.out.println("name : ");
        song.setName(sc.nextLine());
        System.out.println("song: ");
        song.setSinger(sc.nextLine());

        return song;
    }
}
