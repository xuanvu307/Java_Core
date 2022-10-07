package ifElse;
//Số nguyên tố là số chỉ chia hết cho 1 và chính nó
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number");
        int number = sc.nextInt();
        int sum = 0;
        int sqrtNumber =(int)Math.sqrt(number);
        if (number ==1){
            System.out.println("not Prime number");
        } else if (number==2||number ==3 ){
            System.out.println("prime number");
        } else {
            for (int i = 2; i <= sqrtNumber; i++) {
                if (number % i == 0) {
                    sum = 1;
                    break;
                }
            }
        }
        if (sum == 0 ){
            System.out.println("p");
        } else {
            System.out.println("kp");
        }
    }
}
