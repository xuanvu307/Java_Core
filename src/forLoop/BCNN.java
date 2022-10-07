package forLoop;

import java.util.Scanner;

public class BCNN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a");
        int a = sc.nextInt();
        System.out.println("b");
        int b = sc.nextInt();
        for (int i = Math.max(a,b); i<= (a*b); i++){
            if (i%a ==0 && i%b == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
