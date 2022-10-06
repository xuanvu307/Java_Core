package homeWork;
//Bài tập bảng cửu chương
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String check ="y";      //Khai báo biến kiểm tra điều kiện lặp, defaul gán bằng true (y)
        int number = 0;
        do {
            System.out.println("Input number");
            number =sc.nextInt();
            if (number > 9 || number <0){                //Nếu số nhập vào lớn hơn 9 và nhỏ hơn 0 yêu cầu nhập lại
                System.out.println("re-enter number");  //Nếu số nhập vào bằng 0 kết thúc chương trình
                continue;                              //Khác 2 điều kiện trên thì thực hiện
            } else if (number ==0){
                break;
            }else {
                System.out.printf("Multiplication table of %d\n",number);
                for (int i = 1; i < 10; i++){
                    System.out.printf("%d * %d = %d\n",number,i,number*i);
                }
                System.out.println("Do you want to continues(Y/N):");   //Nhập yêu cầu có tiếp tục thực hiện hoặc không
                check = sc.next();                                      //vòng lặp chỉ chạy khi nhập y hoặc Y
            }
        } while (check.equals("y") || check.equals("Y"));
        System.out.println("Stop");
    }
}
