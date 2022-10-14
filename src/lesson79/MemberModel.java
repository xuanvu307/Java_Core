package lesson79;

import java.util.Scanner;

public class MemberModel {

    public Members addMember(){
        Members member = new Members();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name");
        member.setName(sc.nextLine());
        System.out.println("enter birthday");
        member.setBirthday(sc.nextLine());
        System.out.println("enter job");
        member.setJob(sc.nextLine());
        return member;
    }

}
