package forLoop;

import java.util.Scanner;

public class BCNN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a");
        int a = sc.nextInt();
        System.out.println("b");
        int b = sc.nextInt();
        for (int i =1; i<= Math.min(a,b); i++){
            if (a%i ==0 && b%i == 0) {
                System.out.println(i);
            }
        }
    }
}
