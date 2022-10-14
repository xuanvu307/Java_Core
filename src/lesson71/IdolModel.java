package lesson71;

import java.util.Scanner;

public class IdolModel {
    Scanner sc = new Scanner(System.in);

    public Idol inputIdol(){
        Idol idol = new Idol();
        System.out.println("id Idol:");
        idol.setId(sc.nextLine());
        System.out.println("name Idol: ");
        idol.setName(sc.nextLine());
        System.out.println("email Idol: ");
        idol.setEmail(sc.nextLine());
        System.out.println("group Idol: ");
        idol.setGroup(sc.nextLine());
        return idol;
    }
}
