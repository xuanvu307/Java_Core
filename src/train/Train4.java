package train;
// tính tổng 1/1+ 1/2+ ...+1/n
import java.util.Scanner;

public class Train4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        double sum = 0;
        for (int i = 1; i <= input; i++){
            sum += ((double)1)/(i);
        }
        System.out.println("\n" +sum);
    }
}
