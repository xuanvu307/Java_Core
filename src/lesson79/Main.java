package lesson79;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <Members> hoDan1 = new ArrayList<>();

        MemberModel memberModel = new MemberModel();
        Members member1 = memberModel.addMember();
        hoDan1.add(member1);
        Members member2 = memberModel.addMember();
        hoDan1.add(member2);
        Members member3 = memberModel.addMember();
        hoDan1.add(member3);

        System.out.println(hoDan1.toString());

    }
}
