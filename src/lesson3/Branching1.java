package lesson3;

import java.util.Scanner;

public class Branching1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b ;
        System.out.println("Nhập a: ");
        a = sc.nextInt();
        System.out.println("Nhập b: ");
        b = sc.nextInt();
        if (a == 0 && b == 0){
            System.out.println("PT có vô số nghiệm");
        } else if (a == 0 && b !=0 ){
            System.out.println("PT Vô nghiệm");
        } else {
            System.out.println("PT có 1 nghiệm x = " + (-b/a));
        }
    }
}
