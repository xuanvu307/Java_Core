package lesson3;

import java.util.Scanner;

public class Branching3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập số điện:");
        int number = sc.nextInt();
        if (number <= 50 && number >= 0){
            System.out.println("Tiền điện của bạn là: " +number*1000);
        } else if ( number > 50){
            System.out.println("Tiền điện của bạn là: " +((1000*50)+(number-50)*1200));
        } else {
            System.out.println("Số bạn nhập không đúng định dạng");
        }
    }
}

