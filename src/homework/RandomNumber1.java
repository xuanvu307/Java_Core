package homework;

import java.util.Scanner;

public class RandomNumber1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input number");
        int number = sc.nextInt();
        double rdNumber = Math.floor(Math.random()*100);
        System.out.println("số nhập vào:" +number);
        System.out.println("số ngẫu nhiên:" +rdNumber);
        String str = number <= rdNumber ? " Số nhập vào nhỏ hơn số ngẫu nhiên" : " Số nhập vào lớn hơn";
        System.out.println(str);
    }
}
