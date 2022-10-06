package homeWork;

import java.util.Scanner;

public class RandomNumber2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input number");
        double rdNumber = Math.floor(Math.random()*100);
        boolean check = true;
        while (check) {
            int number = sc.nextInt();
            if (number > rdNumber) {
                System.out.println("ban nhap lon hon roi");
            } else if (number <rdNumber) {
                System.out.println("ban nhap nho hon roi");
            } else {
                System.out.println("ban nhap OK");
                check = false;
            }
        }
    }
}
