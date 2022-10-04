package Lesson3;

import java.util.Scanner;

public class ExForLoop3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String name,address, check;
        int age;
        do {
            System.out.println("add name:");
            name = sc.nextLine();
            System.out.println("add address:");
            address = sc.nextLine();
            System.out.println("add age:");
            age = sc.nextInt();
            System.out.println("name: " +name);
            System.out.println("address: " +address);
            System.out.println("age:" +age);
            System.out.println("Do you want to continues: Y/N ");
            sc.nextLine();
            check = sc.nextLine();
        } while (check.equals("y") || check.equals("Y")); // chương trình tiếp tục chỉ khi nhập y hoặc Y
    }
}
