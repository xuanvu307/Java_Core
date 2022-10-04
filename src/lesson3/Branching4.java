package lesson3;

import java.util.Scanner;

public class Branching4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("mời bạn nhập hãng xe cần xem");
        String car = sc.nextLine();
        switch (car) {
            case "toyota" :
                System.out.println("Hãng xe toyota");
                System.out.println(" 1 \n 2 \n 3");
                break;
            case "honda" :
                System.out.println("Hãng xe honda");
                System.out.println(" 1 \n 2 \n 3");
                break;
            case "Suzuki":
                System.out.println("Hãng xe Suzuki");
                System.out.println(" 1 \n 2 \n 3");
                break;
            default:
                System.out.println("chua có dữ liệu");
                break;
        }
    }
}
