package homeWork;

import java.util.Scanner;

public class ExLesson3 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Choose number 1 2 3 4...");
        System.out.println("1. Solve first degree equation");
        System.out.println("2. Solve quadratic equation");
        System.out.println("3. Electricity bill");
        System.out.println("4. Exit");
        int number = sc.nextInt();
        switch (number){
            case 1:                     // Giải PT bậc I
                System.out.println("Input a:");
                double varA = sc.nextDouble();
                System.out.println("input b: ");
                double varB = sc.nextDouble();
                if (varA==0)                                                // Giải Pt bậc I
                    if (varB==0){                                           //Nếu a = 0, b = 0 pt có vô số nghiệm
                        System.out.println("Infinitely many solutions");    // nếu a= 0, b != 0 pt vô nghiệm
                    } else {                                               // nếu a != 0 , pt có 1 nghiệm x = -b/a
                        System.out.println("The equation has no solution");
                    }
                else {
                    System.out.println("Equation with solution x= "+(-varB/varA));
                }
                break;
            case 2:                 // Giải PT bậc II
                System.out.println("Input a:");
                double a = sc.nextDouble();
                System.out.println("Input b:");
                double b = sc.nextDouble();
                System.out.println("Input c:");
                double c = sc.nextDouble();
                double denta = b*b - 4*a*c;
                if (a==0){                  // Xét nếu a =0 thì giải phương trình bậc I
                    if (b==0 && c != 0){
                        System.out.println("The equation has no solution");
                    } else if (b==0 && c==0){
                        System.out.println("Infinitely many solutions");
                    } else {
                        System.out.println("x=" +(-c/b));
                    }
                } else {
                    System.out.println("denta = " +denta);                      // xét a !=0 xét delta và  giải phương tình bậc II
                    if (denta == 0){                                            // Nếu delta  = 0 Phương trình có 1 nghiệm
                        System.out.println("x1 = x2 = " +(-b/a));               // Nếu delta <0 phương trình vô nghiệm
                    } else if (denta < 0) {                                     // nếu delta >0 phương trình có 2 nghiệm x1 và x2
                        System.out.println("The equation has no solution");     // x1= (-b+sqrt(denta))/2a và x2 = (-b-sqrt(delta))/2a
                    } else {
                        double x1 = (-b-Math.sqrt(denta))/(2*a);
                        double x2 = (-b+Math.sqrt(denta))/(2*a);
                        System.out.println("x1=" +x1+ "\nx2="+x2);
                    }
                }
                break;
            case 3:                                                 // Tính tiền điện
                System.out.println("Input number");                 // Nếu số điện từ 0- 50 số thì giá điện 1000 đ
                int electricNumber = sc.nextInt();                  // nếu số điện trên 50 số thi giá là 1200 đ
                if (electricNumber >= 0 && electricNumber <=50){    // nếu nhập < 0 là sai số
                    System.out.println("Your electricity bill = " +electricNumber*1000 + "(VND)");
                } else if (electricNumber > 50) {
                    System.out.println("Your electricity bill = " +(50*1000+ (electricNumber-50)*1200) + "(VND)");
                }else {
                    System.out.println("You entered the wrong format");
                }
                break;
            default:
                System.out.println("exit");
        }
    }
}
