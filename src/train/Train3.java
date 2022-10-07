package train;
// lặp tìm số lần để số random = số nhập vào
import java.util.Random;
import java.util.Scanner;

public class Train3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int number = sc.nextInt();
        int count = 0;
        while (true) {
            int rdNumber = rd.nextInt(100);  //sinh ra số nguyên từ 1-99
            count ++;
            System.out.println(number + " :n " +count + " rdNumber " +rdNumber);
            if (rdNumber == number) {
                System.out.println("\n****** \n"+count);
                break;
            }
        }
    }
}
