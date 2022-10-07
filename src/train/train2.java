package train;
// nhập vào số n và tính tổng chẵn nếu n chẵn, tính lẻ nếu n lẻ
import java.util.Scanner;

public class train2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        if (number %2 == 0) {
            for (int i = 1; i <= number; i ++){
                if (i%2==0) {
                    sum += i;
                }
            }
        } else {
            for (int i = 1; i <= number; i ++){
                if (i%2!=0) {
                    sum += i;
                }
            }
        }
        System.out.println(sum);
    }
}
