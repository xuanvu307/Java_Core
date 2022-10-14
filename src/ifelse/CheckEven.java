package ifelse;

import java.util.Scanner;

public class CheckEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inpet number");
        int number = sc.nextInt();
        String str = (number%2==0)? "even number" : "odd number" ;
        System.out.println("Number is "+str);
    }
}
