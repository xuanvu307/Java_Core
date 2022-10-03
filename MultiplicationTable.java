import java.util.Scanner;

public class ExLesson3 {
    public static void main(String[] args) {
        int number=0;
        String check = "y";
        Scanner sc = new Scanner(System.in);
        do {
            if (check.equals("n")|| check.equals('N')) {
                number =0;
                System.out.println("Stop");
                break;
            }
            System.out.println("Input number:");
            number = sc.nextInt();
            if (number == 0) {
                System.out.println("stop");
            } else if (number > 9 || number < 0) {
                System.out.println("other input number:");
            } else {
                for (int i = 1; i < 10; i++) {
                    System.out.println(i + "*" + number + "=" + i * number);
                }
                System.out.println("Do you want to continues?(Y/N)");
                String checkValue = sc.next();
                check =checkValue;
            }
        } while (number != 0);
    }
}