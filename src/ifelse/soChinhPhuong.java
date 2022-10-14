package ifelse;
//Số chính phương là số bình phương của số khác
import java.util.Scanner;

public class soChinhPhuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so can kiem tra");
        int number = sc.nextInt();
        int sqrtNumber = (int)Math.sqrt(number);
        if (number==sqrtNumber*sqrtNumber && number !=0) {
            System.out.printf("so %d la so chinh phuong cua %d",number,sqrtNumber);
        } else {
            System.out.println("so khong phai la so chinh phuong");
        }
    }
}
