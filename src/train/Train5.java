package train;

import java.util.Scanner;

public class Train5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int input = sc.nextInt();
        int sum = 0;
        for ( int i =1; i <=input; i++){
            if (input %i == 0) {
                System.out.print(i + "\t");
                sum += 1;
            }
        }
        System.out.println("\n*******\n" +sum);
    }
}
