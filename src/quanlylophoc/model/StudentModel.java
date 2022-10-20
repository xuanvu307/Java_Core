package quanlylophoc.model;

import java.util.Scanner;

public class StudentModel {
    UserModel userModel = new UserModel();

    public Student creatStudent(Scanner sc){
        User user = userModel.creatUser(sc);
        System.out.println("iOnline: \n 1. True\n 2. False");
        int chooseOnline = sc.nextInt();
        boolean iOnline;
        switch (chooseOnline){
            case 1:
                iOnline = true;
                break;
            default:
                iOnline = false;
        }
        System.out.println("background: ");
        sc.nextLine();
        String background = sc.nextLine();

        Student student = new Student(user,iOnline,background);

        return student;
    }
}
