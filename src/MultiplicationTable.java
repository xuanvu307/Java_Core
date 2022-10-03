import java.util.Scanner;
// Bài tập nhập bảng cửu chương
public class MultiplicationTable {
    public static void main(String[] args) {
        String check = "y";
        int number = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Input number:");
            number = sc.nextInt();
            if (number == 0){
                System.out.println("Stop");
            }else if( number < 0 || number > 9){
                System.out.println("other input number:");
                continue;
            } else {
                for ( int i = 1; i < 10 ; i++) {
                    System.out.println(number + "*" + i + "=" + number*i);
                }
                System.out.println("Do you want to continues?(Y/N)");
                String checkValue = sc.next();
                check = checkValue;
            }
            if (check.equals("y") || check.equals("Y")){
                continue;
            }
            else {
                number = 0;
                System.out.println("stop");
            }
        } while (number !=0);
    }
}
