package lesson71;

import java.util.Scanner;

public class IdolModel {
    Scanner sc = new Scanner(System.in);

    public Idol inputIdol(){
        Idol idol = new Idol();
        System.out.println("id:");
        idol.setId(sc.nextLine());
        System.out.println("name: ");
        idol.setName(sc.nextLine());
        System.out.println("email: ");
        idol.setEmail(sc.nextLine());
        System.out.println("group: ");
        idol.setGroup(sc.nextLine());
        return idol;
    }
}
