package lesson79;

import java.util.Scanner;

public class HoDanModel {
    Scanner sc = new Scanner(System.in);

    public HoDan inputHoDan(){
        HoDan hoDan = new HoDan();
        System.out.println("nhap so ho dan");
        hoDan.setSoTV(sc.nextInt());
        System.out.println("nhap so nha");
        hoDan.setAddress(sc.nextLine());
        return hoDan;
    }
}
