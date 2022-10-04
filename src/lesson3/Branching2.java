package lesson3;

import java.util.Scanner;

public class Branching2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        double x1, x2;
        System.out.println("Nhập a: ");
        a = sc.nextDouble();
        System.out.println("Nhập b: ");
        b = sc.nextDouble();
        System.out.println("Nhập c: ");
        c = sc.nextDouble();
        double delta = b * b - 4 * a * c;
        if (a == 0) {
            if (b==0 && c ==0) {
                System.out.println("PT có vô số nghiệm");
            } else if ( b==0 && c !=0) {
                System.out.println("PT vô nghiệm");
            } else {
                System.out.println("PT có 1 nghiêm x = "+ (-c/b));
            }
        } else {
            System.out.println("Denta = " +delta);
            if (delta == 0) {
                System.out.println("PT có 1 nghiệm x1= x2 = " + (-b / a));
            } else if (delta > 0) {
                x1 = (-b - Math.sqrt(delta)) / (2 * a);
                x2 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.printf("PT có 2 nghiêm x1= %f và x2= %f ", x1, x2);
            } else {
                System.out.println("PT vô nghiệm");
            }
        }
    }
}
