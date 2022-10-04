package lesson3;

import java.util.Scanner;

public class ExForLoop1 {
    public static void main(String[] args) {
        int sum = 0;
        int core =1;
        Scanner sc= new Scanner(System.in);
        System.out.println("input number n:");
        int n = sc.nextInt();
        for (int i =0 ; i <= n; i++){
            if (i%2 ==0) {
                sum += i;
            }
        }
        System.out.println("Sum n%2 = 0: " +sum);
        int i = 1;
        while (i <=n){
            core *= i;
            i++;
        }
        System.out.println("Core: " +core);
        sum = 0 ;
        i = 1;
        do {
            sum +=i;
            i++;
        } while (i<=n);
        System.out.println("Sum 1-n: " + sum);
    }
}
