package lesson5.homeWork;



import java.time.LocalDate;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employyee employyee = new Employyee();
        LocalDate localDate = LocalDate.now();

        Employyee nguyenA = new Employyee("nv1","nguyenvana", 1999/10/25,1000);
        System.out.println(employyee.getBirthday());

    }
}
