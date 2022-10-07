package forLoop;

import java.util.Scanner;

public class Sum1ForN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int muntiply = 1;
        int n = sc.nextInt();
        for (int i =1 ; i<=n; i++){
            sum +=i;
            muntiply *=i;
        }
        System.out.println("sum 1 to n = " +sum);
        sum = 0;
        for (int i = 0 ; i <=n ; i++){
            if (i%2==0){
                sum +=i;
            }
        }
        System.out.println("sum even number = " +sum);
        System.out.println("Factorial = " +muntiply);
    }

}
