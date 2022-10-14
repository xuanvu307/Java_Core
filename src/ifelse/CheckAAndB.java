package ifelse;

import java.util.Scanner;

public class CheckAAndB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a: ");
        int a = sc.nextInt();
        System.out.println("Input b: ");
        int b = sc.nextInt();
        if (a<=0 && b <= 0){
            System.out.println("two numbers the same sign (-) ");
        } else if (a >= 0 && b >= 0) {
            System.out.println("two numbers the same sign (+) ");
        } else {
            System.out.println("two numbers the different sign");
        }
        if (a*b >= 0) {
            System.out.println("two numbers the same sign");
        } else{
            System.out.println("two numbers the defferent sign");
        }
    }
}
