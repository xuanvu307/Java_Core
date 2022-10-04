package homework;

import java.util.Scanner;

public class ExLesson3 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Chosse number 1 2 3 4...");
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        int number = sc.nextInt();
        switch (number){
            case 1:
                System.out.println("Input a:");
                double varA = sc.nextDouble();
                System.out.println("input b: ");
                double varB = sc.nextDouble();
                if (varA==0)
                    if (varB==0){
                        System.out.println("PT VSN");
                    } else {
                        System.out.println("PTVN");
                    }
                else {
                    System.out.println("x1= "+(-varB/varA));
                }
                break;
            case 2:
                System.out.println("Input a:");
                double a = sc.nextDouble();
                System.out.println("Input b:");
                double b = sc.nextDouble();
                System.out.println("Input c:");
                double c = sc.nextDouble();
                double denta = b*b - 4*a*c;
                if (a==0){
                    if (b==0 && c != 0){
                        System.out.println("PT VN");
                    } else if (b==0 && c==0){
                        System.out.println("PT VSN");
                    } else {
                        System.out.println("x=" +(-c/b));
                    }
                } else {
                    System.out.println("denta = " +denta);
                    if (denta == 0){
                        System.out.println("x1 = x2 = " +(-b/a));
                    } else if (denta < 0) {
                        System.out.println("PT VN");
                    } else {
                        double x1 = (-b-Math.sqrt(denta))/(2*a);
                        double x2 = (-b+Math.sqrt(denta))/(2*a);
                        System.out.println("x1=" +x1+ "x2="+x2);
                    }
                }
                break;
            case 3:
                System.out.println("Input number");
                int electricNumber = sc.nextInt();
                if (electricNumber >= 0 && electricNumber <=50){
                    System.out.println("money = " +electricNumber*1000);
                } else if (electricNumber > 50) {
                    System.out.println("money = " +(50*1000+ (electricNumber-50)*1200));
                }else {
                    System.out.println("number false fomater");
                }
                break;
            default:
                System.out.println("exit");
        }
    }
}
