package quanlylophoc.model;

import java.util.Scanner;


public class TeacherModel {
    UserModel userModel = new UserModel();

    public Teacher creatTeacher(Scanner sc){
        User user = userModel.creatUser(sc);

        System.out.println("yearOfExperiences:");
        int yearOfExperiences = sc.nextInt();
        System.out.println("speciality: ");
        sc.nextLine();
        String speciality = sc.nextLine();

        Teacher teacher = new Teacher(user, yearOfExperiences, speciality);

        return teacher;
    }

}
