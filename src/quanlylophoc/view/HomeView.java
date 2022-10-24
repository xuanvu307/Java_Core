package quanlylophoc.view;

import quanlylophoc.model.StudentModel;
import quanlylophoc.model.TeacherModel;
import quanlylophoc.model.User;
import quanlylophoc.model.UserModel;


import java.util.ArrayList;
import java.util.Scanner;

public class HomeView {

    TeacherModel teacherModel = new TeacherModel();
    StudentModel studentModel = new StudentModel();
    UserModel userModel = new UserModel();

    public void addUser(ArrayList<User> users, Scanner sc){
        System.out.println("input 2 teacher and 6 student ");

        for (int i = 0; i < 2 ;i++){
            System.out.println("input teacher " +(i+1));
            User teacher = teacherModel.creatTeacher(sc);
            users.add(teacher);
        }

        for (int i = 0; i < 6 ;i++){
            System.out.println("Input student " +(i+1));
            User student = studentModel.creatStudent(sc);
            users.add(student);
        }
    }

    public void homePage(Scanner sc, ArrayList<User> users){
        System.out.println("*****************************");
        System.out.println("*       choose number       *");
        System.out.println("*                           *");
        System.out.println("*          1. Print         *");
        System.out.println("*  2.Search email or phone  *");
        System.out.println("*      3. Sort by name      *");
        System.out.println("*      4. Sort re- age      *");
        System.out.println("*****************************");
        int chooseNumber = Integer.parseInt(sc.nextLine());
        switch (chooseNumber){
            case 1:
                System.out.println(users.toString());
                break;
            case 2:
                userModel.search(users,sc);
                break;
            case 3:
                userModel.sortByName(users);
                for (User user: users){
                    System.out.println(user);
                }
                break;
            case 4:
                userModel.sortByAge(users);
                for (User user: users){
                    System.out.println(user);
                }
                break;
        }
    }

}
