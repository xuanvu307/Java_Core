package quanlylophoc.view;

import quanlylophoc.model.StudentModel;
import quanlylophoc.model.TeacherModel;
import quanlylophoc.model.User;

import java.util.ArrayList;
import java.util.Scanner;

public class HomeView {

    TeacherModel teacherModel = new TeacherModel();
    StudentModel studentModel = new StudentModel();

    public void addUser(ArrayList<User> users, Scanner sc){
        System.out.println("input 2 teacher and 6 student ");

        for (int i = 0; i < 2 ;i++){
            System.out.println("input teacher " +(i+1));
            User teacher = teacherModel.creatTeacher(sc);
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
        System.out.println("*           1. print        *");
        System.out.println("*  2.search email or phone  *");
        System.out.println("*       3 soft by name      *");
        System.out.println("*     4 soft re- age     *");
        System.out.println("*****************************");
        int chooseNumber = sc.nextInt();
        switch (chooseNumber){
            case 1:
                print(users);
                break;
            case 2:

            case 3:
            case 4:
        }
    }

    public void print(ArrayList<User> users){
        users.toString();
    }

}
