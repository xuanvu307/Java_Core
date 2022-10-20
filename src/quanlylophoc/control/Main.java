package quanlylophoc.control;


import quanlylophoc.model.StudentModel;
import quanlylophoc.model.User;
import quanlylophoc.view.HomeView;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<>();
        HomeView homeView = new HomeView();
        StudentModel studentModel =  new StudentModel();
        User student = studentModel.creatStudent(sc);
        System.out.println(student.toString());

        homeView.addUser(users,sc);
        homeView.homePage(sc,users);

    }
}
