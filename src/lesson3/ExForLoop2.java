package lesson3;

import java.util.Scanner;

public class ExForLoop2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true){
            System.out.println("input number");
            int number = sc.nextInt();      // nhập vào 1 số nguyên bất kỳ
            System.out.println("do you want continuees:y/n");
            sc.nextLine();
            String check = sc.nextLine();    //chương trình tiếp tục thực hiện khi nhập y
            sum += number;                  // chương trình sẽ kết thúc khi nhập bất kỳ số khác
            if (check.equals("y")) {
                continue;
            } else {
                break;
            }
        }
        System.out.println("Sum = " +sum);
    }
}
