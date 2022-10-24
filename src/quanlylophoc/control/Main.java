package quanlylophoc.control;

import quanlylophoc.model.User;
import quanlylophoc.view.HomeView;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<>();
        HomeView homeView = new HomeView();

        //theem danh sách học viên và giảng viên
        homeView.addUser(users,sc);

        String check = "y";
        while (check.equalsIgnoreCase("y")){
            homeView.homePage(sc,users);
            System.out.println(" do you want to continues y/n");
            check = sc.nextLine();
        }

    }
}
