package ifelse;

import java.util.Scanner;

public class MaxAAndB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number a: ");
        int a = sc.nextInt();
        System.out.println("Input number b: ");
        int b = sc.nextInt();
        System.out.println("max a,b = " +Math.max(a,b));
    }
}
