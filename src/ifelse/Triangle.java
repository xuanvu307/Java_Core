package ifelse;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a,b and c");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if (a+b <= c || a + c <= b || b +c <= a) {
            System.out.println(" number not triangle");
        } else {
            if (a*a == b*b+c*c || b*b == a*a +c*c || c*c == a*a +b*b) {
                System.out.println("right triangle");
            } else {
                System.out.println("triangle");
            }
        }
    }
}
