package Lesson3;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("mời bạn nhập vào 2 số a va b:");
        double a = sc.nextDouble();
        System.out.println("nhạp b");
        double b = sc.nextDouble();
        sc.nextLine();
        System.out.println("Bạn muốn thực hiện phép toán gì:");
        String input = sc.nextLine();
        switch (input){
            case "+":
                System.out.printf("Bạn thực hiện %f + %f= %f" ,a,b,+(a+b));
                break;
            case "-":
                System.out.printf("Bạn thực hiện %f - %f= %f",a,b, +(a-b));
                break;
            case "*":
                System.out.printf("Bạn thực hiện %f * %f= %f" ,a,b,+(a*b));
                break;
            case "/":
                System.out.printf("Bạn thực hiện %f / %f= %f" ,a,b,+(a/b));
                break;
            case "%" :
                System.out.printf("Bạn thực hiện %f % %f = %f",a,b, +(a%b));
                break;
            default:
                System.out.println("chưa thực hiện lệnh gì");
        }
    }
}
