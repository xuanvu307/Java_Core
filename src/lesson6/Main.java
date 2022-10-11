package lesson6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SinhVienIT sinhVienIT = new SinhVienIT();
        sinhVienIT.setHoTen("a");
        sinhVienIT.setNganh("td");
        sinhVienIT.setJava(8.0);
        sinhVienIT.setCss(5.7);
        sinhVienIT.setHtml(7.0);
        sinhVienIT.view();
    }

}
