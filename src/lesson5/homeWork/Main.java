package lesson5.homeWork;

import java.util.Scanner;

public class Main {
    public static int found = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ManagerBook managerBook = new ManagerBook();

        ManagerBook toan = new ManagerBook(1, "toan", "vn", "hoc", "BGD", 2012);
        ManagerBook van = new ManagerBook(2, "van", "vn", "hoc", "BGD", 2019);
        ManagerBook anh = new ManagerBook(3, "anh", "vn", "hoc", "BGD", 2016);
        ManagerBook sinh = new ManagerBook(4, "sinh", "vn", "hoc", "BGD", 2021);
        ManagerBook hoa = new ManagerBook(5, "hoa", "vn", "hoc", "BGD", 2022);

        ManagerBook[] arrayBook = {toan, van, anh, sinh, hoa};

        System.out.print(arrayBook[4] + " ");


    }
}

