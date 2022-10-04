package trying;

import java.util.Scanner;

public class MinAAndBAndC {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Input a:");
        int a = sc.nextInt();
        System.out.println("Input b ");
        int b = sc.nextInt();
        System.out.println("Input c: ");
        int c = sc.nextInt();
        int min = a;
        if (min > b){
            min=b;
        }
        if (min > c){
            min = c;
        }
        System.out.println("Min = " +min);
    }
}
