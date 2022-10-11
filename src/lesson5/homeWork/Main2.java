package lesson5.homeWork;



import java.time.LocalDate;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employyee employyee = new Employyee();
        LocalDate localDate = LocalDate.now();

        Employyee nguyenVanA = new Employyee("NV01","Nguyễn Văn A", "25/11/1999",1000);
        
        System.out.println(nguyenVanA.convertDay());

    }
}
