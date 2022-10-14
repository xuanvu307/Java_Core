package lesson71;

import java.util.Scanner;

public class FolowerModel {
    Scanner sc =  new Scanner(System.in);
    public Follower inputFolower(){
        Follower follower = new Follower();
        System.out.println("id: ");
        follower.setId(sc.nextLine());
        System.out.println("name: ");
        follower.setName(sc.nextLine());
        System.out.println("email: ");
        follower.setEmail(sc.nextLine());
        System.out.println("number like: ");
        follower.setNumberOfLike(sc.nextInt());
        return follower;
    }
}
